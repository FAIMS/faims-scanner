#!/bin/bash

./makeElement.sh style_orientation_orientation "horizontal" input 1 false false false false false .
./makeElement.sh style_even_layout_weight "1" input 1 false false false false false .
./makeElement.sh style_large_layout_weight "3" input 1 false false false false false .
./makeElement.sh User_User_Users "Users" list 1 false false false false false .
./makeElement.sh Control_Control_Next_ID "Next ID" input 1 false false false true false .
./makeElement.sh Control_Control_Create_New_Record "Create New Record" button 1 false false false false false .
./makeElement.sh Control_Search_Search_Term "Search Term" input 2 false false false false false .
./makeElement.sh Control_Search_Search_Button "Search Button" button 2 false false false false false .
./makeElement.sh Control_Search_Entity_List "Entity List" list 1 false false false false false .
./makeElement.sh Scan_Record_Tab_ID "ID" input 1 false false true true false .
./makeElement.sh Scan_Record_Tab_Attach_New_Files "Attach New Files" button 1 false false false false false .
./makeElement.sh Scan_Record_Tab_File_Type "File Type" dropdown 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Language "Language" dropdown 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Repository "Repository" dropdown 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Garrison "Garrison" dropdown 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Period_From "Date from" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Period_Till "Date to" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Doc_Name "Doc Name" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_File_Reference "File Reference" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Architecture_Space "Theme: Architecture/Space" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Crime_Punishment "Theme: Crime/Punishment" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Economics "Theme: Economics" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Education "Theme: Education" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Gender "Theme: Gender" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Host_Communities "Theme: Host Communities" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Legacy_Remembering "Theme: Legacy/Remembering" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Media "Theme: Media" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Medical "Theme: Medical" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Military "Theme: Military" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Politics "Theme: Politics" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Race "Theme: Race" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Social "Theme: Social" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Notes_Notes "Notes" input 1 false false true false false .
./makeElement.sh Scan_Record_Files_Files "Files" file 1 false false true false false .
./makeElement.sh Scan_Record_Files_Files_Button_1 "Files" button 1 false false false false false .

dot -Tsvg datastruct.gv > wireframe.svg
#rm *.xml
#rm *.datastruct.gv
#rm *.wireframeElements.sh

