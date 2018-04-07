package android.com.dutnotification.repositories;

import android.com.dutnotification.daos.StatusDao;
import android.com.dutnotification.entities.Status;

import java.util.List;

/**
 * Created by Kenny on 3/15/2018.
 */

public class StatusRepository {
    private final StatusDao statusDao;

    public StatusRepository(StatusDao statusDao) {
        this.statusDao = statusDao;
    }

    public List<Status> getStatuses() {
        return statusDao.getStatuses();
    }

    public Status getStatusesById(int id) {
        return statusDao.getStatusById(id);
    }

    public void deleteStatus(Status status) {
        statusDao.delete(status);
    }

    public Long insertStatus(Status status) {
        return  statusDao.insert(status);
    }
}
