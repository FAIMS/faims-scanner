#!/usr/bin/env bash

cd module

string="
newScanRecord(){
  String tabgroup = \"Scan_Record\";

  String autoNumSource = \"\";
  autoNumSource = getFieldValue(\"Control\/Control\/Next_ID\");
  if (isNull(autoNumSource)) {
    showWarning(\"{Alert}\",\"{A_next_ID_has_not_been_entered_please_provide_one}\");
    return;
  }

  setUuid(tabgroup, null);
  newTabGroup(tabgroup);

  String autoNumDest = \"\";
  autoNumDest = \"Scan_Record\/Tab\/ID\";
  incAutoNum(autoNumDest);
}"
replacement="
newScanRecord(){
  String tabgroup = \"Scan_Record\";

  String autoNumSource = \"\";
  autoNumSource = getFieldValue(\"Control\/Control\/Next_ID\");
  if (isNull(autoNumSource)) {
    showWarning(\"{Alert}\",\"{A_next_ID_has_not_been_entered_please_provide_one}\");
    return;
  }

  setUuid(tabgroup, null);
  newTabGroup(tabgroup);

  String autoNumDest = \"\";
  autoNumDest = \"Scan_Record\/Tab\/ID\";
  incAutoNum(autoNumDest);

  initialisePeriods();
}"
perl -0777 -i.original -pe "s/\\Q$string/$replacement/igs" ui_logic.bsh

rm ui_logic.bsh.original

echo "No_measurements_to_take=No measurements to take" >> english.0.properties
