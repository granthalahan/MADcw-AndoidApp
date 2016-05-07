package cosjac.madapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * this class should create the individual card data instances.
 * currently just creates dummy instances for testing
 * Created by Sam on 07/05/2016.
 */
public class NotesData {
    private static final String[] dummyTitles = {"dummy title 1", "dummy title 2", "dummy title 3"};
    private static final int[] dummyIcons = {android.R.drawable.ic_popup_reminder, android.R.drawable.ic_menu_add,
            android.R.drawable.ic_menu_delete};

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();

        //this for loop is just for testing
        for (int x = 0; x < 4; x++) {
            //create ListItem with dummy data, then add them to our List
            for (int i = 0; i < dummyTitles.length && i < dummyIcons.length; i++) {
                ListItem item = new ListItem();
                item.setImageResId(dummyIcons[i]);
                item.setTitle(dummyTitles[i]);
                data.add(item);
            }
        }
        return data;
    }
}
