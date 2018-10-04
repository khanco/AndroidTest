package com.example.test.databinding;
import com.example.test.R;
import com.example.test.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemCharacterBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 3);
        sViewsWithIds.put(R.id.imvNext, 4);
    }
    // views
    @NonNull
    public final android.widget.ImageView imageView;
    @NonNull
    public final android.widget.ImageView imvNext;
    @NonNull
    public final android.support.constraint.ConstraintLayout itemContainer;
    @NonNull
    public final android.widget.TextView tvDesc;
    @NonNull
    public final android.widget.TextView tvName;
    // variables
    @Nullable
    private com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter mModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemCharacterBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.imageView = (android.widget.ImageView) bindings[3];
        this.imvNext = (android.widget.ImageView) bindings[4];
        this.itemContainer = (android.support.constraint.ConstraintLayout) bindings[0];
        this.itemContainer.setTag(null);
        this.tvDesc = (android.widget.TextView) bindings[2];
        this.tvDesc.setTag(null);
        this.tvName = (android.widget.TextView) bindings[1];
        this.tvName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    @Nullable
    public com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter getModel() {
        return mModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String stringFormatTvDescAndroidStringBirthYearModelBirthYear = null;
        com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter model = mModel;
        java.lang.String modelBirthYear = null;
        java.lang.String modelName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.birthYear
                    modelBirthYear = model.getBirthYear();
                    // read model.name
                    modelName = model.getName();
                }


                // read String.format(@android:string/birth_year, model.birthYear)
                stringFormatTvDescAndroidStringBirthYearModelBirthYear = java.lang.String.format(tvDesc.getResources().getString(R.string.birth_year), modelBirthYear);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvDesc, stringFormatTvDescAndroidStringBirthYearModelBirthYear);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, modelName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ListItemCharacterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ListItemCharacterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ListItemCharacterBinding>inflate(inflater, com.example.test.R.layout.list_item_character, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ListItemCharacterBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ListItemCharacterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.test.R.layout.list_item_character, null, false), bindingComponent);
    }
    @NonNull
    public static ListItemCharacterBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ListItemCharacterBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/list_item_character_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ListItemCharacterBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}