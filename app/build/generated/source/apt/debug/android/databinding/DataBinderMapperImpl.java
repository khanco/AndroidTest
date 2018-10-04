
package android.databinding;
import com.example.test.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.example.test.R.layout.activity_star_character_list:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_star_character_list_0".equals(tag)) {
                            return new com.example.test.databinding.ActivityStarCharacterListBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_star_character_list is invalid. Received: " + tag);
                }
                case com.example.test.R.layout.activity_star_character_details:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_star_character_details_0".equals(tag)) {
                            return new com.example.test.databinding.ActivityStarCharacterDetailsBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_star_character_details is invalid. Received: " + tag);
                }
                case com.example.test.R.layout.list_item_character:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/list_item_character_0".equals(tag)) {
                            return new com.example.test.databinding.ListItemCharacterBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for list_item_character is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 2093513543: {
                if(tag.equals("layout/activity_star_character_list_0")) {
                    return com.example.test.R.layout.activity_star_character_list;
                }
                break;
            }
            case -104999941: {
                if(tag.equals("layout/activity_star_character_details_0")) {
                    return com.example.test.R.layout.activity_star_character_details;
                }
                break;
            }
            case 1939069386: {
                if(tag.equals("layout/list_item_character_0")) {
                    return com.example.test.R.layout.list_item_character;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"model"
            ,"viewModel"};
    }
}