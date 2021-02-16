package ru.netology.domain;

public class Donut {
    private boolean IsDonut;
    private String PaidDuration;
    private String Placeholder;
    private boolean CanPublishFreeCopy;
    private String EditMode;

    public boolean isDonut() {
        return IsDonut;
    }

    public void setDonut(boolean donut) {
        IsDonut = donut;
    }

    public String getPaidDuration() {
        return PaidDuration;
    }

    public void setPaidDuration(String paidDuration) {
        PaidDuration = paidDuration;
    }

    public String getPlaceholder() {
        return Placeholder;
    }

    public void setPlaceholder(String placeholder) {
        Placeholder = placeholder;
    }

    public boolean isCanPublishFreeCopy() {
        return CanPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        CanPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return EditMode;
    }

    public void setEditMode(String editMode) {
        EditMode = editMode;
    }
}
