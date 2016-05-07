package cosjac.madapp.model;

/**
 *
 * Created by Sam on 07/05/2016.
 */
public class ListItem
{
    private String title;
    private String body;
    private int imageResId;
    private boolean isMuted = false;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
