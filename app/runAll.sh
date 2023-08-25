#!/bin/bash

YELLOW=$(tput setaf 3)
CYAN=$(tput setaf 6)
WHITE=$(tput sgr0)

# all kt files
for i in $(find . -type f -name "*.kt")
do
    # only files with main()
    if grep -q "fun main()" "$i"; then
        echo "$CYAN >>>>> Executing file $i <<<<< $WHITE"

        classname=$(echo "$i" | sed "s~\./src/main/kotlin/cmolisee/leetcodekotlin/~~")
        classname=$(echo "$classname" | sed -r "s~\.kt~~")
        classname=$(echo "$classname" | sed -r "s~/~.~g")

        echo "$CYAN parsed classname: "cmolisee.leetcodekotlin.${classname}Kt" $WHITE"
        # execute single file
        gradle run -Pmain="cmolisee.leetcodekotlin.${classname}Kt" -q -Dorg.gradle.console=plain --warning-mode=summary
    else
        # else skip
        echo "$YELLOW >>>>> Skipping file $i <<<<< $WHITE"
    fi
done