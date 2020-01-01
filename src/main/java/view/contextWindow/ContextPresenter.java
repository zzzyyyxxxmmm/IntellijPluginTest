package view.contextWindow;

/**
 * @author jikangwang
 */
public class ContextPresenter implements ContextContract.Presenter {

    private final ContextContract.View ContextView;

    public ContextPresenter(ContextContract.View contextView) {
        ContextView = contextView;
    }


    @Override
    public void start() {

    }


    @Override
    public void loadContext() {
        ContextView.showContext("123");
    }
}
