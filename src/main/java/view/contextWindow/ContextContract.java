package view.contextWindow;

import view.base.BasePresenter;
import view.base.BaseView;

/**
 * @author jikangwang
 */
public interface ContextContract {

    interface View extends BaseView<Presenter> {
        void showContext(String s);
        void showUpdatingLabel(boolean show);
    }

    interface Presenter extends BasePresenter {
        void loadContext();
        void saveContext();
    }

}

