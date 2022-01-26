package org.training.core.job;


import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeLog extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(TimeLog.class);
    @Override
    public PerformResult perform(final CronJobModel cronJobModel){

        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LOG.info("TimeLog is running! Recent time is " + localTime +" and recent date is "+ localDate);
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
