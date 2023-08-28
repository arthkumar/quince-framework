package dataprovider;

import com.quince.controller.request.body.UserBodyBuilder;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProblemDP {
    public static final int USER_COUNT = 500;

    @DataProvider(parallel = true)
    public Object[][] problemDP() {
        return getUserIDs().stream()
                .map(id -> new Object[]{UserBodyBuilder.getUser(id)})
                .toArray(Object[][]::new);
    }

    private static List<String> getUserIDs() {
        List<String> ids = new ArrayList<>();
        for (int i = 0; i < USER_COUNT; i++) {
            ids.add(UUID.randomUUID().toString());
        }
        return ids;
    }
}
