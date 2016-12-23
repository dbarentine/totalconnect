
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebMethodResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebMethodResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ResultData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebMethodResults", propOrder = {
    "resultCode",
    "resultData"
})
@XmlSeeAlso({
    CountryStateListResultEx.class,
    TimeZonesResult.class,
    TCCWiFiLocationsResults.class,
    ExecuteASceneResults.class,
    DealerMessageResult.class,
    WiFiLockLocationsResults.class,
    NotificationMethodResults.class,
    GetSmartActionConfigurationResults.class,
    VideoPIRConfigurationResults.class,
    DisableEnableUserResults.class,
    PanelMetadataAndStatusResultsEx.class,
    CameraBatteryStatusResult.class,
    UserDetailsExResults.class,
    VideoFileURLExResult.class,
    EventsResult.class,
    AuthenticateLoginResults.class,
    EmailValidationResult.class,
    GetDoorBellSettingsResult.class,
    GPSDeviceGeoFenceResult.class,
    EULAResults.class,
    SceneDataResults.class,
    UserDetailResults.class,
    InsertMobileDeviceTokenResult.class,
    ForecastWeatherResult.class,
    ContentConfigurationResult.class,
    WiFiLocationsResults.class,
    PanelMetadataAndStatusResults.class,
    AppStaticKeyListInfo.class,
    DoorbellEventsResult.class,
    LocationResult.class,
    ThermostatScheduleResults.class,
    UpdateSwitchIconResults.class,
    CustomArmSettingsResult.class,
    SummaryConfiguredEventXML.class,
    SlideShowPhotoResult.class,
    EventMetaDataResults.class,
    InterfaceSchemaResults.class,
    WiFiWeatherResponse.class,
    SaveUserResults.class,
    PanelStatusResults.class,
    DisarmSecuritySystemResults.class,
    AutomationLockDataResult.class,
    CameraFirmwareListResult.class,
    SyncJobResult.class,
    AutomationDataResultsTransitional.class,
    GetAllNotificationListsResults.class,
    NotificationPauseResult.class,
    ArmSecuritySystemResults.class,
    GetAssociatedSkybellDevicesResult.class,
    GetZonesListInStateExResult.class,
    PanelStatusResultsExV1 .class,
    UserInfoResults.class,
    PhotoURLResult.class,
    GetPartnerVideoURLResult.class,
    SummaryConfiguredEventString.class,
    MediaServerConfigurationResults.class,
    TransactNotificationListResults.class,
    GeofenceListResult.class,
    LockControlDataResults.class,
    EventMetaDataExResult.class,
    GPSDevicesResult.class,
    AnythingChangedResults.class,
    LocationSimpleResult.class,
    CameraPositionResult.class,
    AllCameraListResult.class,
    ThermostatResponse.class,
    RSICamLookinResults.class,
    NotificationStatusResult.class,
    CountryStateListResult.class,
    SessionDetailResults.class,
    SwitchControlDataResults.class,
    NotificationConditionalStateResult.class,
    CameraIOStateResult.class,
    SaveCreateUserInfoResults.class,
    RemoteAuthenticateLoginResults.class,
    PanelStatusResultsEx.class,
    ZoneBypassResults.class,
    EventTypeFilterResult.class,
    VideoFileURLResult.class,
    WAPClientsListResults.class,
    UpdateThermostatScheduleResults.class,
    CountryListResult.class,
    GetSmartSceneConfigurationResults.class,
    GetDeviceStatusResult.class,
    WifiThermostatScheduleResults.class,
    GPSPopupURLResult.class,
    ReadConsoleDisplayResults.class,
    VideoPIRCaptureTypesResults.class,
    SessionDetailResultsEx.class,
    UserConfigurationResults.class,
    AutomationSyncResults.class,
    CurrentWeatherResult.class,
    IsUserNameValidResults.class,
    ThermostatControlDataResults.class,
    CameraInformationResults.class,
    SMSEmailCarrierResults.class,
    SceneDeletionResults.class,
    CameraSignalStrengthResults.class,
    SceneListInfo.class,
    ConfigStreamModeResult.class,
    SecurityPanelPartitionsResults.class,
    CustomArmSecuritySystemResults.class,
    EULATextResults.class,
    PanelConnectionStatusInfoResults.class,
    UserListResults.class,
    ListHelpDocsResults.class,
    VideoPIRListResults.class,
    ConfiguredEventResult.class,
    DeleteUserInfoResults.class,
    DeleteUserResults.class,
    NotificationScheduleResult.class,
    UpdateDoorbellDetailResult.class,
    DeviceInviteTokenResults.class,
    CreateEditASceneResults.class,
    PanelMetadataAndStatusResultsExV1 .class,
    GPSLocationResult.class,
    WiFiDoorBellInfoResult.class,
    InterfaceSchemaResultsEx.class,
    PartnerListResult.class,
    GetZoneInfoResults.class,
    GetVideoPIRDeviceEventsResults.class,
    AutomationDataResults.class,
    SynchronizeUserResults.class,
    GetZonesListInStateResult.class,
    CameraStateResult.class,
    NotesResult.class,
    GetVideoPIREventRecordResults.class,
    GetSmartActionListResults.class,
    RSIDeviceStatusResults.class,
    CameraListResult.class,
    CameraConfigurationResults.class,
    GetRSIVideoURLInfoResult.class,
    GetScenesListResults.class
})
public class WebMethodResults {

    @XmlElement(name = "ResultCode")
    protected int resultCode;
    @XmlElement(name = "ResultData")
    protected String resultData;

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultData() {
        return resultData;
    }

    /**
     * Sets the value of the resultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultData(String value) {
        this.resultData = value;
    }

}
