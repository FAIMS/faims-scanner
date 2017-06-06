package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Scan_Record
     */
    public static View get_ScanRecord(Solo solo) {
        String ref = "Scan_Record";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  User
     */
    public static View get_User(Solo solo) {
        String ref = "User";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/Control
     */
    public static View get_Control_Control(Solo solo) {
        String ref = "Control/Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Search
     */
    public static View get_Control_Search(Solo solo) {
        String ref = "Control/Search";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Scan_Record/Files
     */
    public static View get_ScanRecord_Files(Solo solo) {
        String ref = "Scan_Record/Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Scan_Record/Notes
     */
    public static View get_ScanRecord_Notes(Solo solo) {
        String ref = "Scan_Record/Notes";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Scan_Record/Tab
     */
    public static View get_ScanRecord_Tab(Solo solo) {
        String ref = "Scan_Record/Tab";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  User/User
     */
    public static View get_User_User(Solo solo) {
        String ref = "User/User";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/Control/Create_New_Record
     */
    public static View get_Control_Control_CreateNewRecord(Solo solo) {
        String ref = "Control/Control/Create_New_Record";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Search/Search_Button
     */
    public static View get_Control_Search_SearchButton(Solo solo) {
        String ref = "Control/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Scan_Record/Files/Button_Files
     */
    public static View get_ScanRecord_Files_ButtonFiles(Solo solo) {
        String ref = "Scan_Record/Files/Button_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Scan_Record/Tab/Attach_New_Files
     */
    public static View get_ScanRecord_Tab_AttachNewFiles(Solo solo) {
        String ref = "Scan_Record/Tab/Attach_New_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Architecture_Space
     */
    public static View get_ScanRecord_Tab_ThemeArchitectureSpace(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Architecture_Space";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Crime_Punishment
     */
    public static View get_ScanRecord_Tab_ThemeCrimePunishment(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Crime_Punishment";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Economics
     */
    public static View get_ScanRecord_Tab_ThemeEconomics(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Economics";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Education
     */
    public static View get_ScanRecord_Tab_ThemeEducation(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Education";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Gender
     */
    public static View get_ScanRecord_Tab_ThemeGender(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Gender";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Host_Communities
     */
    public static View get_ScanRecord_Tab_ThemeHostCommunities(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Host_Communities";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Legacy_Remembering
     */
    public static View get_ScanRecord_Tab_ThemeLegacyRemembering(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Legacy_Remembering";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Media
     */
    public static View get_ScanRecord_Tab_ThemeMedia(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Media";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Medical
     */
    public static View get_ScanRecord_Tab_ThemeMedical(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Medical";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Military
     */
    public static View get_ScanRecord_Tab_ThemeMilitary(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Military";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Politics
     */
    public static View get_ScanRecord_Tab_ThemePolitics(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Politics";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Race
     */
    public static View get_ScanRecord_Tab_ThemeRace(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Race";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Social
     */
    public static View get_ScanRecord_Tab_ThemeSocial(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Social";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Scan_Record/Files/Files
     */
    public static View get_ScanRecord_Files_Files(Solo solo) {
        String ref = "Scan_Record/Files/Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Scan_Record/Tab/File_Type
     */
    public static View get_ScanRecord_Tab_FileType(Solo solo) {
        String ref = "Scan_Record/Tab/File_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Scan_Record/Tab/Garrison
     */
    public static View get_ScanRecord_Tab_Garrison(Solo solo) {
        String ref = "Scan_Record/Tab/Garrison";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Scan_Record/Tab/Language
     */
    public static View get_ScanRecord_Tab_Language(Solo solo) {
        String ref = "Scan_Record/Tab/Language";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Scan_Record/Tab/Repository
     */
    public static View get_ScanRecord_Tab_Repository(Solo solo) {
        String ref = "Scan_Record/Tab/Repository";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Control/Next_ID
     */
    public static View get_Control_Control_NextID(Solo solo) {
        String ref = "Control/Control/Next_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Entity_Types
     */
    public static EditText get_Control_Search_EntityTypes(Solo solo) {
        String ref = "Control/Search/Entity_Types";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Search_Term
     */
    public static EditText get_Control_Search_SearchTerm(Solo solo) {
        String ref = "Control/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Notes/Notes
     */
    public static EditText get_ScanRecord_Notes_Notes(Solo solo) {
        String ref = "Scan_Record/Notes/Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/Doc_Name
     */
    public static EditText get_ScanRecord_Tab_DocName(Solo solo) {
        String ref = "Scan_Record/Tab/Doc_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/File_Reference
     */
    public static EditText get_ScanRecord_Tab_FileReference(Solo solo) {
        String ref = "Scan_Record/Tab/File_Reference";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/ID
     */
    public static EditText get_ScanRecord_Tab_ID(Solo solo) {
        String ref = "Scan_Record/Tab/ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/Period_From
     */
    public static EditText get_ScanRecord_Tab_PeriodFrom(Solo solo) {
        String ref = "Scan_Record/Tab/Period_From";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/Period_Till
     */
    public static EditText get_ScanRecord_Tab_PeriodTill(Solo solo) {
        String ref = "Scan_Record/Tab/Period_Till";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Search/Entity_List
     */
    public static View get_Control_Search_EntityList(Solo solo) {
        String ref = "Control/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  User/User/Users
     */
    public static View get_User_User_Users(Solo solo) {
        String ref = "User/User/Users";
        return (android.view.View) solo.getView((Object) ref);
    }
}
