package com.example.application.views.userdatabase;

import com.example.application.components.avataritem.AvatarItem;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("User Database")
@Route(value = "my-view5", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class UserDatabaseView extends Composite<VerticalLayout> {

    public UserDatabaseView() {
        FormLayout formLayout3Col = new FormLayout();
        AvatarItem avatarItem = new AvatarItem();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, formLayout3Col);
        formLayout3Col.setWidth("100%");
        formLayout3Col.getStyle().set("flex-grow", "1");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        avatarItem.setWidth("min-content");
        setAvatarItemSampleData(avatarItem);
        getContent().add(formLayout3Col);
        formLayout3Col.add(avatarItem);
    }

    private void setAvatarItemSampleData(AvatarItem avatarItem) {
        avatarItem.setHeading("Aria Bailey");
        avatarItem.setDescription("Endocrinologist");
        avatarItem.setAvatar(new Avatar("Aria Bailey"));
    }
}
