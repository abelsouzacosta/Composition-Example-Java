package sharedKernel;

import domain.enums.WorkerLevel;

public class WorkerLevelValidator {
    public static boolean isWorkerLevelValid(WorkerLevel level) {
        for (WorkerLevel validLevel: WorkerLevel.values()) {
            if (validLevel == level)
                return true;
        }

        return false;
    }
}
