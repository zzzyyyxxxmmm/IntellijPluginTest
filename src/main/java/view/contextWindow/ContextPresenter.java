package view.contextWindow;

import javax.swing.*;

/**
 * @author jikangwang
 */
public class ContextPresenter implements ContextContract.Presenter {

    private final ContextContract.View contextView;

    public ContextPresenter(ContextContract.View contextView) {
        this.contextView = contextView;
    }

    @Override
    public void start() {

    }

    @Override
    public void loadContext() {
        contextView.showContext("123");
    }

    @Override
    public void saveContext() {
        contextView.showUpdatingLabel(true);
        new Thread(new Runnable(){

            @Override
            public void run(){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //time consuming algorithm.
                SwingUtilities.invokeLater(new Runnable(){
                    @Override public void run(){
                        contextView.showUpdatingLabel(false);
                    }
                });
            }

        }).start();
    }
}
