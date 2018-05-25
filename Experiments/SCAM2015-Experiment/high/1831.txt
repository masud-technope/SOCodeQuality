int fromYear, fromMonth, toYear, toMonth;
Property year = Property.forName("year");
Property month = Property.forName("month");
session.createCriteria(CommissionSummary.class).add(Restrictions.disjunction()
    .add(Restrictions.and(year.eq(fromYear), month.ge(fromMonth))
    .add(Restrictions.and(year.gt(fromYear), year.lt(toYear))
    .add(Restrictions.and(year.eq(toYear), month.le(toMonth))
);