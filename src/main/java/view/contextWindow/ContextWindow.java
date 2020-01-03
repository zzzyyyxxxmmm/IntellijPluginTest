package view.contextWindow;

import javafx.scene.control.Tooltip;

import javax.swing.*;

/**
 * @author jikangwang
 */
public class ContextWindow implements ContextContract.View {
    private JPanel myContextWindowContent;
    private JButton loadContextButton;
    private JButton saveContextButton;
    private JComboBox nameComboBox;
    private JLabel nameLabel;
    private JLabel updatingLabel;
    private ContextContract.Presenter mPresenter;

    public ContextWindow() {
        setPresenter(null);
        loadContextButton.addActionListener(e -> mPresenter.loadContext());
        saveContextButton.addActionListener(e -> mPresenter.saveContext());
        nameComboBox.setEditable(true);
        nameComboBox.addItem("123");
        nameComboBox.addItem("234");
        updatingLabel.setVisible(false);
    }

    public JPanel getContent() {
        return myContextWindowContent;
    }

    @Override
    public void setPresenter(ContextContract.Presenter presenter) {
        this.mPresenter = new ContextPresenter(this);
    }

    @Override
    public void showContext(String s) {
    }

    @Override
    public void showUpdatingLabel(boolean show) {
        updatingLabel.setVisible(show);
    }


}
