package com.example.test.databinding;
import com.example.test.R;
import com.example.test.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityStarCharacterListBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerView, 6);
        sViewsWithIds.put(R.id.tvName, 7);
    }
    // views
    @NonNull
    public final android.widget.Button btnRetry;
    @NonNull
    public final android.widget.LinearLayout llError;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    public final android.widget.ProgressBar progressBar;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.widget.TextView tvName;
    // variables
    @Nullable
    private com.example.test.screens.starcharacterlist.mvvm.viewmodels.StarCharacterListViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityStarCharacterListBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.btnRetry = (android.widget.Button) bindings[5];
        this.btnRetry.setTag(null);
        this.llError = (android.widget.LinearLayout) bindings[2];
        this.llError.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.progressBar = (android.widget.ProgressBar) bindings[1];
        this.progressBar.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[6];
        this.tvName = (android.widget.TextView) bindings[7];
        setRootTag(root);
        // listeners
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.test.screens.starcharacterlist.mvvm.viewmodels.StarCharacterListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.test.screens.starcharacterlist.mvvm.viewmodels.StarCharacterListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.example.test.screens.starcharacterlist.mvvm.viewmodels.StarCharacterListViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelShowLoader((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelConnectedToInternet((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelSuccess((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowLoader(android.databinding.ObservableBoolean ViewModelShowLoader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelConnectedToInternet(android.databinding.ObservableBoolean ViewModelConnectedToInternet, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSuccess(android.databinding.ObservableBoolean ViewModelSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
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
        int viewModelConnectedToInternetBooleanTrueViewModelSuccessViewVISIBLEViewGONE = 0;
        boolean viewModelShowLoaderGet = false;
        android.databinding.ObservableBoolean viewModelShowLoader = null;
        boolean viewModelSuccess = false;
        int viewModelSuccessViewGONEViewVISIBLE = 0;
        int viewModelShowLoaderViewVISIBLEViewGONE = 0;
        android.databinding.ObservableBoolean viewModelConnectedToInternet = null;
        boolean ViewModelConnectedToInternet1 = false;
        android.databinding.ObservableBoolean ViewModelSuccess1 = null;
        boolean viewModelConnectedToInternetGet = false;
        boolean viewModelSuccessGet = false;
        boolean viewModelConnectedToInternetBooleanTrueViewModelSuccess = false;
        int viewModelConnectedToInternetViewGONEViewVISIBLE = 0;
        com.example.test.screens.starcharacterlist.mvvm.viewmodels.StarCharacterListViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showLoader
                        viewModelShowLoader = viewModel.showLoader;
                    }
                    updateRegistration(0, viewModelShowLoader);


                    if (viewModelShowLoader != null) {
                        // read viewModel.showLoader.get()
                        viewModelShowLoaderGet = viewModelShowLoader.get();
                    }
                if((dirtyFlags & 0x19L) != 0) {
                    if(viewModelShowLoaderGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.showLoader.get() ? View.VISIBLE : View.GONE
                    viewModelShowLoaderViewVISIBLEViewGONE = ((viewModelShowLoaderGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1eL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.connectedToInternet
                        viewModelConnectedToInternet = viewModel.connectedToInternet;
                    }
                    updateRegistration(1, viewModelConnectedToInternet);


                    if (viewModelConnectedToInternet != null) {
                        // read viewModel.connectedToInternet.get()
                        viewModelConnectedToInternetGet = viewModelConnectedToInternet.get();
                    }
                if((dirtyFlags & 0x1aL) != 0) {
                    if(viewModelConnectedToInternetGet) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read !viewModel.connectedToInternet.get()
                    ViewModelConnectedToInternet1 = !viewModelConnectedToInternetGet;
                if((dirtyFlags & 0x1eL) != 0) {
                    if(ViewModelConnectedToInternet1) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
                if ((dirtyFlags & 0x1aL) != 0) {

                        // read viewModel.connectedToInternet.get() ? View.GONE : View.VISIBLE
                        viewModelConnectedToInternetViewGONEViewVISIBLE = ((viewModelConnectedToInternetGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.success
                        ViewModelSuccess1 = viewModel.success;
                    }
                    updateRegistration(2, ViewModelSuccess1);


                    if (ViewModelSuccess1 != null) {
                        // read viewModel.success.get()
                        viewModelSuccessGet = ViewModelSuccess1.get();
                    }
                if((dirtyFlags & 0x1cL) != 0) {
                    if(viewModelSuccessGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.success.get() ? View.GONE : View.VISIBLE
                    viewModelSuccessViewGONEViewVISIBLE = ((viewModelSuccessGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x800L) != 0) {

                if (viewModel != null) {
                    // read viewModel.success
                    ViewModelSuccess1 = viewModel.success;
                }
                updateRegistration(2, ViewModelSuccess1);


                if (ViewModelSuccess1 != null) {
                    // read viewModel.success.get()
                    viewModelSuccessGet = ViewModelSuccess1.get();
                }
            if((dirtyFlags & 0x1cL) != 0) {
                if(viewModelSuccessGet) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read !viewModel.success.get()
                viewModelSuccess = !viewModelSuccessGet;
        }

        if ((dirtyFlags & 0x1eL) != 0) {

                // read !viewModel.connectedToInternet.get() ? true : !viewModel.success.get()
                viewModelConnectedToInternetBooleanTrueViewModelSuccess = ((ViewModelConnectedToInternet1) ? (true) : (viewModelSuccess));
            if((dirtyFlags & 0x1eL) != 0) {
                if(viewModelConnectedToInternetBooleanTrueViewModelSuccess) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read !viewModel.connectedToInternet.get() ? true : !viewModel.success.get() ? View.VISIBLE : View.GONE
                viewModelConnectedToInternetBooleanTrueViewModelSuccessViewVISIBLEViewGONE = ((viewModelConnectedToInternetBooleanTrueViewModelSuccess) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnRetry.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x1eL) != 0) {
            // api target 1

            this.llError.setVisibility(viewModelConnectedToInternetBooleanTrueViewModelSuccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewModelConnectedToInternetViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelSuccessViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.progressBar.setVisibility(viewModelShowLoaderViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.example.test.screens.starcharacterlist.mvvm.viewmodels.StarCharacterListViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.fetchData();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityStarCharacterListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityStarCharacterListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityStarCharacterListBinding>inflate(inflater, com.example.test.R.layout.activity_star_character_list, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityStarCharacterListBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityStarCharacterListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.test.R.layout.activity_star_character_list, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityStarCharacterListBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityStarCharacterListBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_star_character_list_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityStarCharacterListBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.showLoader
        flag 1 (0x2L): viewModel.connectedToInternet
        flag 2 (0x3L): viewModel.success
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): !viewModel.connectedToInternet.get() ? true : !viewModel.success.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): !viewModel.connectedToInternet.get() ? true : !viewModel.success.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.success.get() ? View.GONE : View.VISIBLE
        flag 8 (0x9L): viewModel.success.get() ? View.GONE : View.VISIBLE
        flag 9 (0xaL): viewModel.showLoader.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.showLoader.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): !viewModel.connectedToInternet.get() ? true : !viewModel.success.get()
        flag 12 (0xdL): !viewModel.connectedToInternet.get() ? true : !viewModel.success.get()
        flag 13 (0xeL): viewModel.connectedToInternet.get() ? View.GONE : View.VISIBLE
        flag 14 (0xfL): viewModel.connectedToInternet.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}