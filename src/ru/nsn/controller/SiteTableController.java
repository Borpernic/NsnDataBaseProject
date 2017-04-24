package ru.nsn.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputMethodEvent;
import ru.nsn.model.Site;
import ru.nsn.model.SitesDataBaseModel;
import ru.nsn.view.MainApp;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Borpernic on 02.04.2017.
 */
public class SiteTableController {
    @FXML
    private TableView siteTableFxId;
    @FXML
    private TableColumn siteTableColumnComments;
    @FXML
    private TableColumn siteTableColumnSiteSatus;
    @FXML
    private TableColumn siteTableColumnRdApproveMfPaper;
    @FXML
    private TableColumn siteTableColumnRdApproveMf;
    @FXML
    private TableColumn siteTableColumnRdStatus;
    @FXML
    private TableColumn siteTableColumnRdDate;
    @FXML
    private TableColumn siteTableColumnRdOwner;
    @FXML
    private TableColumn siteTableColumnTssrLlApprove;
    @FXML
    private TableColumn siteTableColumnTssrMfPaperApprove;
    @FXML
    private TableColumn siteTableColumnTssrMfApprove;
    @FXML
    private TableColumn siteTableColumnTssrSmrApprove;
    @FXML
    private TableColumn siteTableColumnTssrPepApprove;
    @FXML
    private TableColumn siteTableColumnTssrWepApprove;
    @FXML
    private TableColumn siteTableColumnTssrRrsApprove;
    @FXML
    private TableColumn siteTableColumnTssrNpoApprove;
    @FXML
    private TableColumn siteTableColumnTssrStatus;
    @FXML
    private TableColumn siteTableColumnTssrDate;
    @FXML
    private TableColumn siteTableColumnTssrOwner;
    @FXML
    private TableColumn siteTableColumnApStatus;
    @FXML
    private TableColumn siteTableColumnApDate;
    @FXML
    private TableColumn siteTableColumnSarfStatus;
    @FXML
    private TableColumn siteTableColumnSarfDate;
    @FXML
    private TableColumn siteTableColumnSarfOwner;
    @FXML
    private TableColumn siteTableColumnTzEpuStatus;
    @FXML
    private TableColumn siteTableColumnTzEpuDate;
    @FXML
    private TableColumn siteTableColumnPhotoReportStatus;
    @FXML
    private TableColumn siteTableColumnPhotoReportDate;
    @FXML
    private TableColumn siteTableColumnPhotoReport;
    @FXML
    private TableColumn siteTableColumnSurveyDate;
    @FXML
    private TableColumn siteTableColumnSurveyDatePlaned;
    @FXML
    private TableColumn siteTableColumnSiteNumberMf;
    @FXML
    private TableColumn siteTableColumnSiteNumberYota;
    @FXML
    private TableColumn siteTableColumnSiteAdress;
    @FXML
    private TableColumn siteTableColumnSiteId;
    private MainApp mainApp;

    @FXML
    private ComboBox<Integer> comboboxFindId;
    @FXML
    private ComboBox<Integer> comboboxFilterId;

    private SitesDataBaseModel sitesDataBaseModel;

    public SiteTableController() {
    }

    public void onChangeText(InputMethodEvent inputMethodEvent) {

    }

    @FXML
    private void initialize() {


        List<TableColumn> siteTableList = new ArrayList<>();
    }

    public void initSiteDataBaseModel(SitesDataBaseModel sitesDataBaseModel) {
        if (this.sitesDataBaseModel != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }

        this.sitesDataBaseModel = sitesDataBaseModel;
        siteTableFxId.setItems(sitesDataBaseModel.getSiteList());
        siteTableFxId.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            sitesDataBaseModel.setCurrentSite((Site) newValue);
        });
        sitesDataBaseModel.currentSiteProperty().addListener((obs, oldSite, newSite) -> {
            if (newSite == null) {
                siteTableFxId.getSelectionModel().clearSelection();
            } else {
                siteTableFxId.getSelectionModel().select(newSite);
            }
        });

        siteTableColumnSiteId.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnSiteNumberMf.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteNumberMf"));
        siteTableColumnSiteNumberYota.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteNumberYota"));
        siteTableColumnSiteAdress.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteAdress"));

        siteTableColumnSurveyDatePlaned.setCellValueFactory(new PropertyValueFactory<Site, Integer>("surveyDatePlaned"));
        siteTableColumnSurveyDate.setCellValueFactory(new PropertyValueFactory<Site, Date>("surveyDate"));

        siteTableColumnPhotoReport.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnPhotoReportDate.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnPhotoReportStatus.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));

        siteTableColumnTzEpuDate.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnTzEpuStatus.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));

        siteTableColumnSarfOwner.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnSarfDate.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnSarfStatus.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnApDate.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnApStatus.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));

        siteTableColumnTssrOwner.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnTssrDate.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnTssrStatus.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnTssrNpoApprove.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));

        siteTableColumnTssrRrsApprove.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnTssrWepApprove.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnTssrPepApprove.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnTssrSmrApprove.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));

        siteTableColumnTssrMfApprove.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnTssrMfPaperApprove.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnTssrLlApprove.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnRdOwner.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnRdDate.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnRdStatus.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnRdApproveMf.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnRdApproveMfPaper.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnSiteSatus.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));
        siteTableColumnComments.setCellValueFactory(new PropertyValueFactory<Site, Integer>("siteId"));


        sitesDataBaseModel.loadSiteDabase(new File(""));

    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
