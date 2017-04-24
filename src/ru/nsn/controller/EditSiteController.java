package ru.nsn.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import ru.nsn.model.SitesDataBaseModel;

/**
 * Created by Borpernic on 15.04.2017.
 */
public class EditSiteController {

    @FXML
    private TextField siteTableColumnSiteSatus;
    @FXML
    private TextField siteTableColumnComments;
    @FXML
    private TextField siteTableColumnSiteAdress;
    @FXML
    private TextField siteTableColumnSiteNumberYota;
    @FXML
    private TextField siteTableColumnSiteNumberMf;
    @FXML
    private TextField siteTableColumnSiteId;


    private SitesDataBaseModel sitesDataBaseModel;

    public void initModel(SitesDataBaseModel sitesDataBaseModel) {
        if (this.sitesDataBaseModel != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.sitesDataBaseModel = sitesDataBaseModel;
/*        sitesDataBaseModel.currentSiteProperty().addListener((ObservableValue<Site> obs, Site oldSite, Site newSite) -> {
            if (oldSite != null) {
                sitesDataBaseModel.currentSiteProperty().unbindBidirectional(oldSite.siteIdProperty());
                sitesDataBaseModel.currentSiteProperty().unbindBidirectional(oldSite.siteNumberMfProperty());
                sitesDataBaseModel.currentSiteProperty().unbindBidirectional(oldSite.siteNumberYotaProperty());
                siteTableColumnComments.textProperty().unbindBidirectional(oldSite.tzEpuCommentProperty());
            }
            if (newSite == null) {
                firstNameField.setText("");
                lastNameField.setText("");
                emailField.setText("");
            } else {
                firstNameField.textProperty().bindBidirectional(newSite.firstNameProperty());
                lastNameField.textProperty().bindBidirectional(newSite.lastNameProperty());
                emailField.textProperty().bindBidirectional(newSite.emailProperty());
            }
        });*/
    }


}
