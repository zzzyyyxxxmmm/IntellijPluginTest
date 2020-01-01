package view.contextWindow;

import javax.swing.*;

/**
 * @author jikangwang
 */
public class ContextWindow implements ContextContract.View {
    private JPanel myContextWindowContent;
    private JTextArea jTextArea;
    private JButton loadContextButton;
    private JButton saveContextButton;
    private JComboBox nameComboBox;
    private JLabel nameLabel;
    private ContextContract.Presenter mPresenter;

    public ContextWindow() {
        setPresenter(null);
        loadContextButton.addActionListener(e -> mPresenter.loadContext());
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
        jTextArea.setText(s);
    }
}
