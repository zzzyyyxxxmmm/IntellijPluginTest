package view;

import java.awt.*;

public class GridBagConstraintsBuilder {

    private int gridx = GridBagConstraints.RELATIVE;

    private int gridy = GridBagConstraints.RELATIVE;

    private int gridwidth = 1;

    private int gridheight = 1;

    private double weightx = 0.0;

    private double weighty = 0.0;

    private int anchor = GridBagConstraints.CENTER;

    private int fill = GridBagConstraints.NONE;

    private int insetTop = 0;

    private int insetLeft = 0;

    private int insetBottom = 0;

    private int insetRight = 0;

    private int ipadx = 0;

    private int ipady = 0;


    public GridBagConstraintsBuilder gridx(int gridx) {
        this.gridx = gridx;
        return this;
    }

    public GridBagConstraintsBuilder gridy(int gridy) {
        this.gridy = gridy;
        return this;
    }

    GridBagConstraintsBuilder gridwidth(int gridwidth) {
        this.gridwidth = gridwidth;
        return this;
    }

    GridBagConstraintsBuilder gridheight(int gridheight) {
        this.gridheight = gridheight;
        return this;
    }

    GridBagConstraintsBuilder weightx(double weightx) {
        this.weightx = weightx;
        return this;
    }

    GridBagConstraintsBuilder weighty(double weighty) {
        this.weighty = weighty;
        return this;
    }

    GridBagConstraintsBuilder anchor(int anchor) {
        this.anchor = anchor;
        return this;
    }

    GridBagConstraintsBuilder anchorWest() {
        this.anchor = GridBagConstraints.WEST;
        return this;
    }

    GridBagConstraintsBuilder anchorEast() {
        this.anchor = GridBagConstraints.EAST;
        return this;
    }

    GridBagConstraintsBuilder fill(int fill) {
        this.fill = fill;
        return this;
    }

    GridBagConstraintsBuilder fillHorizontal() {
        this.fill = GridBagConstraints.HORIZONTAL;
        return this;
    }

    GridBagConstraintsBuilder fillVertical() {
        this.fill = GridBagConstraints.VERTICAL;
        return this;
    }

    GridBagConstraintsBuilder fillBoth() {
        this.fill = GridBagConstraints.BOTH;
        return this;
    }

    GridBagConstraintsBuilder fillNone() {
        this.fill = GridBagConstraints.NONE;
        return this;
    }

    GridBagConstraintsBuilder ipadx(int ipadx) {
        this.ipadx = ipadx;
        return this;
    }

    GridBagConstraintsBuilder ipady(int ipady) {
        this.ipady = ipady;
        return this;
    }

    GridBagConstraintsBuilder insetTop(int insetTop) {
        this.insetTop = insetTop;
        return this;
    }

    GridBagConstraintsBuilder insetLeft(int insetLeft) {
        this.insetLeft = insetLeft;
        return this;
    }

    GridBagConstraintsBuilder insetBottom(int insetBottom) {
        this.insetBottom = insetBottom;
        return this;
    }

    GridBagConstraintsBuilder insetRight(int insetRight) {
        this.insetRight = insetRight;
        return this;
    }

    GridBagConstraints build() {
        return new GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty, anchor, fill, new Insets(insetTop, insetLeft, insetBottom, insetRight), ipadx, ipady);
    }

}