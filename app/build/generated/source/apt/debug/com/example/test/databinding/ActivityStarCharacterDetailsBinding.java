package com.example.test.databinding;
import com.example.test.R;
import com.example.test.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityStarCharacterDetailsBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    public final android.widget.TextView tvHeight;
    @NonNull
    public final android.widget.TextView tvMAss;
    @NonNull
    public final android.widget.TextView tvName;
    @NonNull
    public final android.widget.TextView tvRecordedDateTime;
    // variables
    @Nullable
    private com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter mModel;
    @Nullable
    private com.example.test.screens.starcharacterdetails.mvvm.viewmodels.StarCharacterDetailsViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityStarCharacterDetailsBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvHeight = (android.widget.TextView) bindings[2];
        this.tvHeight.setTag(null);
        this.tvMAss = (android.widget.TextView) bindings[3];
        this.tvMAss.setTag(null);
        this.tvName = (android.widget.TextView) bindings[1];
        this.tvName.setTag(null);
        this.tvRecordedDateTime = (android.widget.TextView) bindings[4];
        this.tvRecordedDateTime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.test.screens.starcharacterdetails.mvvm.viewmodels.StarCharacterDetailsViewModel) variable);
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
    public void setViewModel(@Nullable com.example.test.screens.starcharacterdetails.mvvm.viewmodels.StarCharacterDetailsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.example.test.screens.starcharacterdetails.mvvm.viewmodels.StarCharacterDetailsViewModel getViewModel() {
        return mViewModel;
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
        java.lang.String viewModelGetHeightInMetersFromCmsModelHeight = null;
        java.lang.String modelCreated = null;
        java.lang.String modelHeight = null;
        java.lang.String stringFormatTvHeightAndroidStringHeightValueViewModelGetHeightInMetersFromCmsModelHeight = null;
        com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter model = mModel;
        java.lang.String viewModelGetRecordDateTimeModelCreated = null;
        java.lang.String stringFormatTvMAssAndroidStringMassValueModelMass = null;
        java.lang.String modelMass = null;
        java.lang.String modelName = null;
        com.example.test.screens.starcharacterdetails.mvvm.viewmodels.StarCharacterDetailsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (model != null) {
                    // read model.created
                    modelCreated = model.getCreated();
                    // read model.height
                    modelHeight = model.getHeight();
                }


                if (viewModel != null) {
                    // read viewModel.getRecordDateTime(model.created)
                    viewModelGetRecordDateTimeModelCreated = viewModel.getRecordDateTime(modelCreated);
                    // read viewModel.getHeightInMetersFromCms(model.height)
                    viewModelGetHeightInMetersFromCmsModelHeight = viewModel.getHeightInMetersFromCms(modelHeight);
                }


                // read String.format(@android:string/height_value, viewModel.getHeightInMetersFromCms(model.height))
                stringFormatTvHeightAndroidStringHeightValueViewModelGetHeightInMetersFromCmsModelHeight = java.lang.String.format(tvHeight.getResources().getString(R.string.height_value), viewModelGetHeightInMetersFromCmsModelHeight);
            if ((dirtyFlags & 0x5L) != 0) {

                    if (model != null) {
                        // read model.mass
                        modelMass = model.getMass();
                        // read model.name
                        modelName = model.getName();
                    }


                    // read String.format(@android:string/mass_value, model.mass)
                    stringFormatTvMAssAndroidStringMassValueModelMass = java.lang.String.format(tvMAss.getResources().getString(R.string.mass_value), modelMass);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeight, stringFormatTvHeightAndroidStringHeightValueViewModelGetHeightInMetersFromCmsModelHeight);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvRecordedDateTime, viewModelGetRecordDateTimeModelCreated);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvMAss, stringFormatTvMAssAndroidStringMassValueModelMass);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, modelName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityStarCharacterDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityStarCharacterDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityStarCharacterDetailsBinding>inflate(inflater, com.example.test.R.layout.activity_star_character_details, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityStarCharacterDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityStarCharacterDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.test.R.layout.activity_star_character_details, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityStarCharacterDetailsBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityStarCharacterDetailsBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_star_character_details_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityStarCharacterDetailsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}