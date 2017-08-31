package com.github.aistomin.enums;

import java.util.Date;
import java.util.GregorianCalendar;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aistomin on 31.08.17.
 * <p>
 * Some curious situations with Java dates.
 */
public class JavaDateTest {

    /**
     * The situation when months operations are not symmetric.
     *
     * @throws Exception If something goes wrong.
     */
    @Test
    public void testMonthAgo() throws Exception {
        // 31st July 2017
        final Date now = new GregorianCalendar(2017, 6, 31).getTime();
        final Date monthAgo = DateUtils.addMonths(now, -1);
        Assert.assertEquals(now, DateUtils.addMonths(monthAgo, 1)); // Boom!!!
    }
}
