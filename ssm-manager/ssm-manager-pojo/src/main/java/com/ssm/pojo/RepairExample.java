package com.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRepairIdIsNull() {
            addCriterion("repair_id is null");
            return (Criteria) this;
        }

        public Criteria andRepairIdIsNotNull() {
            addCriterion("repair_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepairIdEqualTo(Integer value) {
            addCriterion("repair_id =", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotEqualTo(Integer value) {
            addCriterion("repair_id <>", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThan(Integer value) {
            addCriterion("repair_id >", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("repair_id >=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThan(Integer value) {
            addCriterion("repair_id <", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThanOrEqualTo(Integer value) {
            addCriterion("repair_id <=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdIn(List<Integer> values) {
            addCriterion("repair_id in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotIn(List<Integer> values) {
            addCriterion("repair_id not in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdBetween(Integer value1, Integer value2) {
            addCriterion("repair_id between", value1, value2, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotBetween(Integer value1, Integer value2) {
            addCriterion("repair_id not between", value1, value2, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairTitleIsNull() {
            addCriterion("repair_title is null");
            return (Criteria) this;
        }

        public Criteria andRepairTitleIsNotNull() {
            addCriterion("repair_title is not null");
            return (Criteria) this;
        }

        public Criteria andRepairTitleEqualTo(String value) {
            addCriterion("repair_title =", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleNotEqualTo(String value) {
            addCriterion("repair_title <>", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleGreaterThan(String value) {
            addCriterion("repair_title >", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleGreaterThanOrEqualTo(String value) {
            addCriterion("repair_title >=", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleLessThan(String value) {
            addCriterion("repair_title <", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleLessThanOrEqualTo(String value) {
            addCriterion("repair_title <=", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleLike(String value) {
            addCriterion("repair_title like", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleNotLike(String value) {
            addCriterion("repair_title not like", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleIn(List<String> values) {
            addCriterion("repair_title in", values, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleNotIn(List<String> values) {
            addCriterion("repair_title not in", values, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleBetween(String value1, String value2) {
            addCriterion("repair_title between", value1, value2, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleNotBetween(String value1, String value2) {
            addCriterion("repair_title not between", value1, value2, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairDateIsNull() {
            addCriterion("repair_date is null");
            return (Criteria) this;
        }

        public Criteria andRepairDateIsNotNull() {
            addCriterion("repair_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepairDateEqualTo(Date value) {
            addCriterion("repair_date =", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotEqualTo(Date value) {
            addCriterion("repair_date <>", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateGreaterThan(Date value) {
            addCriterion("repair_date >", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateGreaterThanOrEqualTo(Date value) {
            addCriterion("repair_date >=", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateLessThan(Date value) {
            addCriterion("repair_date <", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateLessThanOrEqualTo(Date value) {
            addCriterion("repair_date <=", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateIn(List<Date> values) {
            addCriterion("repair_date in", values, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotIn(List<Date> values) {
            addCriterion("repair_date not in", values, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateBetween(Date value1, Date value2) {
            addCriterion("repair_date between", value1, value2, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotBetween(Date value1, Date value2) {
            addCriterion("repair_date not between", value1, value2, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairStatusIsNull() {
            addCriterion("repair_status is null");
            return (Criteria) this;
        }

        public Criteria andRepairStatusIsNotNull() {
            addCriterion("repair_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepairStatusEqualTo(String value) {
            addCriterion("repair_status =", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusNotEqualTo(String value) {
            addCriterion("repair_status <>", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusGreaterThan(String value) {
            addCriterion("repair_status >", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusGreaterThanOrEqualTo(String value) {
            addCriterion("repair_status >=", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusLessThan(String value) {
            addCriterion("repair_status <", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusLessThanOrEqualTo(String value) {
            addCriterion("repair_status <=", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusLike(String value) {
            addCriterion("repair_status like", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusNotLike(String value) {
            addCriterion("repair_status not like", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusIn(List<String> values) {
            addCriterion("repair_status in", values, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusNotIn(List<String> values) {
            addCriterion("repair_status not in", values, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusBetween(String value1, String value2) {
            addCriterion("repair_status between", value1, value2, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusNotBetween(String value1, String value2) {
            addCriterion("repair_status not between", value1, value2, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeIsNull() {
            addCriterion("repair_office is null");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeIsNotNull() {
            addCriterion("repair_office is not null");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeEqualTo(String value) {
            addCriterion("repair_office =", value, "repairOffice");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeNotEqualTo(String value) {
            addCriterion("repair_office <>", value, "repairOffice");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeGreaterThan(String value) {
            addCriterion("repair_office >", value, "repairOffice");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("repair_office >=", value, "repairOffice");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeLessThan(String value) {
            addCriterion("repair_office <", value, "repairOffice");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeLessThanOrEqualTo(String value) {
            addCriterion("repair_office <=", value, "repairOffice");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeLike(String value) {
            addCriterion("repair_office like", value, "repairOffice");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeNotLike(String value) {
            addCriterion("repair_office not like", value, "repairOffice");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeIn(List<String> values) {
            addCriterion("repair_office in", values, "repairOffice");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeNotIn(List<String> values) {
            addCriterion("repair_office not in", values, "repairOffice");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeBetween(String value1, String value2) {
            addCriterion("repair_office between", value1, value2, "repairOffice");
            return (Criteria) this;
        }

        public Criteria andRepairOfficeNotBetween(String value1, String value2) {
            addCriterion("repair_office not between", value1, value2, "repairOffice");
            return (Criteria) this;
        }

        public Criteria andRepairDescIsNull() {
            addCriterion("repair_desc is null");
            return (Criteria) this;
        }

        public Criteria andRepairDescIsNotNull() {
            addCriterion("repair_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRepairDescEqualTo(String value) {
            addCriterion("repair_desc =", value, "repairDesc");
            return (Criteria) this;
        }

        public Criteria andRepairDescNotEqualTo(String value) {
            addCriterion("repair_desc <>", value, "repairDesc");
            return (Criteria) this;
        }

        public Criteria andRepairDescGreaterThan(String value) {
            addCriterion("repair_desc >", value, "repairDesc");
            return (Criteria) this;
        }

        public Criteria andRepairDescGreaterThanOrEqualTo(String value) {
            addCriterion("repair_desc >=", value, "repairDesc");
            return (Criteria) this;
        }

        public Criteria andRepairDescLessThan(String value) {
            addCriterion("repair_desc <", value, "repairDesc");
            return (Criteria) this;
        }

        public Criteria andRepairDescLessThanOrEqualTo(String value) {
            addCriterion("repair_desc <=", value, "repairDesc");
            return (Criteria) this;
        }

        public Criteria andRepairDescLike(String value) {
            addCriterion("repair_desc like", value, "repairDesc");
            return (Criteria) this;
        }

        public Criteria andRepairDescNotLike(String value) {
            addCriterion("repair_desc not like", value, "repairDesc");
            return (Criteria) this;
        }

        public Criteria andRepairDescIn(List<String> values) {
            addCriterion("repair_desc in", values, "repairDesc");
            return (Criteria) this;
        }

        public Criteria andRepairDescNotIn(List<String> values) {
            addCriterion("repair_desc not in", values, "repairDesc");
            return (Criteria) this;
        }

        public Criteria andRepairDescBetween(String value1, String value2) {
            addCriterion("repair_desc between", value1, value2, "repairDesc");
            return (Criteria) this;
        }

        public Criteria andRepairDescNotBetween(String value1, String value2) {
            addCriterion("repair_desc not between", value1, value2, "repairDesc");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadIsNull() {
            addCriterion("repair_mainhead is null");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadIsNotNull() {
            addCriterion("repair_mainhead is not null");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadEqualTo(String value) {
            addCriterion("repair_mainhead =", value, "repairMainhead");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadNotEqualTo(String value) {
            addCriterion("repair_mainhead <>", value, "repairMainhead");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadGreaterThan(String value) {
            addCriterion("repair_mainhead >", value, "repairMainhead");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadGreaterThanOrEqualTo(String value) {
            addCriterion("repair_mainhead >=", value, "repairMainhead");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadLessThan(String value) {
            addCriterion("repair_mainhead <", value, "repairMainhead");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadLessThanOrEqualTo(String value) {
            addCriterion("repair_mainhead <=", value, "repairMainhead");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadLike(String value) {
            addCriterion("repair_mainhead like", value, "repairMainhead");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadNotLike(String value) {
            addCriterion("repair_mainhead not like", value, "repairMainhead");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadIn(List<String> values) {
            addCriterion("repair_mainhead in", values, "repairMainhead");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadNotIn(List<String> values) {
            addCriterion("repair_mainhead not in", values, "repairMainhead");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadBetween(String value1, String value2) {
            addCriterion("repair_mainhead between", value1, value2, "repairMainhead");
            return (Criteria) this;
        }

        public Criteria andRepairMainheadNotBetween(String value1, String value2) {
            addCriterion("repair_mainhead not between", value1, value2, "repairMainhead");
            return (Criteria) this;
        }

        public Criteria andMainheadtelIsNull() {
            addCriterion("mainheadTel is null");
            return (Criteria) this;
        }

        public Criteria andMainheadtelIsNotNull() {
            addCriterion("mainheadTel is not null");
            return (Criteria) this;
        }

        public Criteria andMainheadtelEqualTo(String value) {
            addCriterion("mainheadTel =", value, "mainheadtel");
            return (Criteria) this;
        }

        public Criteria andMainheadtelNotEqualTo(String value) {
            addCriterion("mainheadTel <>", value, "mainheadtel");
            return (Criteria) this;
        }

        public Criteria andMainheadtelGreaterThan(String value) {
            addCriterion("mainheadTel >", value, "mainheadtel");
            return (Criteria) this;
        }

        public Criteria andMainheadtelGreaterThanOrEqualTo(String value) {
            addCriterion("mainheadTel >=", value, "mainheadtel");
            return (Criteria) this;
        }

        public Criteria andMainheadtelLessThan(String value) {
            addCriterion("mainheadTel <", value, "mainheadtel");
            return (Criteria) this;
        }

        public Criteria andMainheadtelLessThanOrEqualTo(String value) {
            addCriterion("mainheadTel <=", value, "mainheadtel");
            return (Criteria) this;
        }

        public Criteria andMainheadtelLike(String value) {
            addCriterion("mainheadTel like", value, "mainheadtel");
            return (Criteria) this;
        }

        public Criteria andMainheadtelNotLike(String value) {
            addCriterion("mainheadTel not like", value, "mainheadtel");
            return (Criteria) this;
        }

        public Criteria andMainheadtelIn(List<String> values) {
            addCriterion("mainheadTel in", values, "mainheadtel");
            return (Criteria) this;
        }

        public Criteria andMainheadtelNotIn(List<String> values) {
            addCriterion("mainheadTel not in", values, "mainheadtel");
            return (Criteria) this;
        }

        public Criteria andMainheadtelBetween(String value1, String value2) {
            addCriterion("mainheadTel between", value1, value2, "mainheadtel");
            return (Criteria) this;
        }

        public Criteria andMainheadtelNotBetween(String value1, String value2) {
            addCriterion("mainheadTel not between", value1, value2, "mainheadtel");
            return (Criteria) this;
        }

        public Criteria andRepairTelIsNull() {
            addCriterion("repair_tel is null");
            return (Criteria) this;
        }

        public Criteria andRepairTelIsNotNull() {
            addCriterion("repair_tel is not null");
            return (Criteria) this;
        }

        public Criteria andRepairTelEqualTo(String value) {
            addCriterion("repair_tel =", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelNotEqualTo(String value) {
            addCriterion("repair_tel <>", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelGreaterThan(String value) {
            addCriterion("repair_tel >", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelGreaterThanOrEqualTo(String value) {
            addCriterion("repair_tel >=", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelLessThan(String value) {
            addCriterion("repair_tel <", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelLessThanOrEqualTo(String value) {
            addCriterion("repair_tel <=", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelLike(String value) {
            addCriterion("repair_tel like", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelNotLike(String value) {
            addCriterion("repair_tel not like", value, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelIn(List<String> values) {
            addCriterion("repair_tel in", values, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelNotIn(List<String> values) {
            addCriterion("repair_tel not in", values, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelBetween(String value1, String value2) {
            addCriterion("repair_tel between", value1, value2, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairTelNotBetween(String value1, String value2) {
            addCriterion("repair_tel not between", value1, value2, "repairTel");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityIsNull() {
            addCriterion("repair_facility is null");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityIsNotNull() {
            addCriterion("repair_facility is not null");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityEqualTo(String value) {
            addCriterion("repair_facility =", value, "repairFacility");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityNotEqualTo(String value) {
            addCriterion("repair_facility <>", value, "repairFacility");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityGreaterThan(String value) {
            addCriterion("repair_facility >", value, "repairFacility");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityGreaterThanOrEqualTo(String value) {
            addCriterion("repair_facility >=", value, "repairFacility");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityLessThan(String value) {
            addCriterion("repair_facility <", value, "repairFacility");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityLessThanOrEqualTo(String value) {
            addCriterion("repair_facility <=", value, "repairFacility");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityLike(String value) {
            addCriterion("repair_facility like", value, "repairFacility");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityNotLike(String value) {
            addCriterion("repair_facility not like", value, "repairFacility");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityIn(List<String> values) {
            addCriterion("repair_facility in", values, "repairFacility");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityNotIn(List<String> values) {
            addCriterion("repair_facility not in", values, "repairFacility");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityBetween(String value1, String value2) {
            addCriterion("repair_facility between", value1, value2, "repairFacility");
            return (Criteria) this;
        }

        public Criteria andRepairFacilityNotBetween(String value1, String value2) {
            addCriterion("repair_facility not between", value1, value2, "repairFacility");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}