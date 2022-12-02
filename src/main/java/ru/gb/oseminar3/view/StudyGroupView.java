package ru.gb.oseminar3.view;

import ru.gb.oseminar3.data.StudyGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudyGroupView {
    public void sendOnConsoleStudyGroups(List<StudyGroup> studyGroups) {
        Logger log = Logger.getAnonymousLogger();
        for (StudyGroup studyGroup : studyGroups) {
                log.info(studyGroup.toString());
        }
    }
}
