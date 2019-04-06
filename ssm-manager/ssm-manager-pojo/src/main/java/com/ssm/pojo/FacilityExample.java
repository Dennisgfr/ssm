package com.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacilityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FacilityExample() {
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

        public Criteria andFacilityIdIsNull() {
            addCriterion("facility_id is null");
            return (Criteria) this;
        }

        public Criteria andFacilityIdIsNotNull() {
            addCriterion("facility_id is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityIdEqualTo(Integer value) {
            addCriterion("facility_id =", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdNotEqualTo(Integer value) {
            addCriterion("facility_id <>", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdGreaterThan(Integer value) {
            addCriterion("facility_id >", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("facility_id >=", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdLessThan(Integer value) {
            addCriterion("facility_id <", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdLessThanOrEqualTo(Integer value) {
            addCriterion("facility_id <=", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdIn(List<Integer> values) {
            addCriterion("facility_id in", values, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdNotIn(List<Integer> values) {
            addCriterion("facility_id not in", values, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdBetween(Integer value1, Integer value2) {
            addCriterion("facility_id between", value1, value2, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("facility_id not between", value1, value2, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityNameIsNull() {
            addCriterion("facility_name is null");
            return (Criteria) this;
        }

        public Criteria andFacilityNameIsNotNull() {
            addCriterion("facility_name is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityNameEqualTo(String value) {
            addCriterion("facility_name =", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotEqualTo(String value) {
            addCriterion("facility_name <>", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameGreaterThan(String value) {
            addCriterion("facility_name >", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameGreaterThanOrEqualTo(String value) {
            addCriterion("facility_name >=", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameLessThan(String value) {
            addCriterion("facility_name <", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameLessThanOrEqualTo(String value) {
            addCriterion("facility_name <=", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameLike(String value) {
            addCriterion("facility_name like", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotLike(String value) {
            addCriterion("facility_name not like", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameIn(List<String> values) {
            addCriterion("facility_name in", values, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotIn(List<String> values) {
            addCriterion("facility_name not in", values, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameBetween(String value1, String value2) {
            addCriterion("facility_name between", value1, value2, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotBetween(String value1, String value2) {
            addCriterion("facility_name not between", value1, value2, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityAmountIsNull() {
            addCriterion("facility_amount is null");
            return (Criteria) this;
        }

        public Criteria andFacilityAmountIsNotNull() {
            addCriterion("facility_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityAmountEqualTo(Integer value) {
            addCriterion("facility_amount =", value, "facilityAmount");
            return (Criteria) this;
        }

        public Criteria andFacilityAmountNotEqualTo(Integer value) {
            addCriterion("facility_amount <>", value, "facilityAmount");
            return (Criteria) this;
        }

        public Criteria andFacilityAmountGreaterThan(Integer value) {
            addCriterion("facility_amount >", value, "facilityAmount");
            return (Criteria) this;
        }

        public Criteria andFacilityAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("facility_amount >=", value, "facilityAmount");
            return (Criteria) this;
        }

        public Criteria andFacilityAmountLessThan(Integer value) {
            addCriterion("facility_amount <", value, "facilityAmount");
            return (Criteria) this;
        }

        public Criteria andFacilityAmountLessThanOrEqualTo(Integer value) {
            addCriterion("facility_amount <=", value, "facilityAmount");
            return (Criteria) this;
        }

        public Criteria andFacilityAmountIn(List<Integer> values) {
            addCriterion("facility_amount in", values, "facilityAmount");
            return (Criteria) this;
        }

        public Criteria andFacilityAmountNotIn(List<Integer> values) {
            addCriterion("facility_amount not in", values, "facilityAmount");
            return (Criteria) this;
        }

        public Criteria andFacilityAmountBetween(Integer value1, Integer value2) {
            addCriterion("facility_amount between", value1, value2, "facilityAmount");
            return (Criteria) this;
        }

        public Criteria andFacilityAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("facility_amount not between", value1, value2, "facilityAmount");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryIsNull() {
            addCriterion("facility_factory is null");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryIsNotNull() {
            addCriterion("facility_factory is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryEqualTo(String value) {
            addCriterion("facility_factory =", value, "facilityFactory");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryNotEqualTo(String value) {
            addCriterion("facility_factory <>", value, "facilityFactory");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryGreaterThan(String value) {
            addCriterion("facility_factory >", value, "facilityFactory");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("facility_factory >=", value, "facilityFactory");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryLessThan(String value) {
            addCriterion("facility_factory <", value, "facilityFactory");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryLessThanOrEqualTo(String value) {
            addCriterion("facility_factory <=", value, "facilityFactory");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryLike(String value) {
            addCriterion("facility_factory like", value, "facilityFactory");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryNotLike(String value) {
            addCriterion("facility_factory not like", value, "facilityFactory");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryIn(List<String> values) {
            addCriterion("facility_factory in", values, "facilityFactory");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryNotIn(List<String> values) {
            addCriterion("facility_factory not in", values, "facilityFactory");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryBetween(String value1, String value2) {
            addCriterion("facility_factory between", value1, value2, "facilityFactory");
            return (Criteria) this;
        }

        public Criteria andFacilityFactoryNotBetween(String value1, String value2) {
            addCriterion("facility_factory not between", value1, value2, "facilityFactory");
            return (Criteria) this;
        }

        public Criteria andFacilityMdateIsNull() {
            addCriterion("facility_mdate is null");
            return (Criteria) this;
        }

        public Criteria andFacilityMdateIsNotNull() {
            addCriterion("facility_mdate is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityMdateEqualTo(Date value) {
            addCriterion("facility_mdate =", value, "facilityMdate");
            return (Criteria) this;
        }

        public Criteria andFacilityMdateNotEqualTo(Date value) {
            addCriterion("facility_mdate <>", value, "facilityMdate");
            return (Criteria) this;
        }

        public Criteria andFacilityMdateGreaterThan(Date value) {
            addCriterion("facility_mdate >", value, "facilityMdate");
            return (Criteria) this;
        }

        public Criteria andFacilityMdateGreaterThanOrEqualTo(Date value) {
            addCriterion("facility_mdate >=", value, "facilityMdate");
            return (Criteria) this;
        }

        public Criteria andFacilityMdateLessThan(Date value) {
            addCriterion("facility_mdate <", value, "facilityMdate");
            return (Criteria) this;
        }

        public Criteria andFacilityMdateLessThanOrEqualTo(Date value) {
            addCriterion("facility_mdate <=", value, "facilityMdate");
            return (Criteria) this;
        }

        public Criteria andFacilityMdateIn(List<Date> values) {
            addCriterion("facility_mdate in", values, "facilityMdate");
            return (Criteria) this;
        }

        public Criteria andFacilityMdateNotIn(List<Date> values) {
            addCriterion("facility_mdate not in", values, "facilityMdate");
            return (Criteria) this;
        }

        public Criteria andFacilityMdateBetween(Date value1, Date value2) {
            addCriterion("facility_mdate between", value1, value2, "facilityMdate");
            return (Criteria) this;
        }

        public Criteria andFacilityMdateNotBetween(Date value1, Date value2) {
            addCriterion("facility_mdate not between", value1, value2, "facilityMdate");
            return (Criteria) this;
        }

        public Criteria andFacilityPdateIsNull() {
            addCriterion("facility_pdate is null");
            return (Criteria) this;
        }

        public Criteria andFacilityPdateIsNotNull() {
            addCriterion("facility_pdate is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityPdateEqualTo(Date value) {
            addCriterion("facility_pdate =", value, "facilityPdate");
            return (Criteria) this;
        }

        public Criteria andFacilityPdateNotEqualTo(Date value) {
            addCriterion("facility_pdate <>", value, "facilityPdate");
            return (Criteria) this;
        }

        public Criteria andFacilityPdateGreaterThan(Date value) {
            addCriterion("facility_pdate >", value, "facilityPdate");
            return (Criteria) this;
        }

        public Criteria andFacilityPdateGreaterThanOrEqualTo(Date value) {
            addCriterion("facility_pdate >=", value, "facilityPdate");
            return (Criteria) this;
        }

        public Criteria andFacilityPdateLessThan(Date value) {
            addCriterion("facility_pdate <", value, "facilityPdate");
            return (Criteria) this;
        }

        public Criteria andFacilityPdateLessThanOrEqualTo(Date value) {
            addCriterion("facility_pdate <=", value, "facilityPdate");
            return (Criteria) this;
        }

        public Criteria andFacilityPdateIn(List<Date> values) {
            addCriterion("facility_pdate in", values, "facilityPdate");
            return (Criteria) this;
        }

        public Criteria andFacilityPdateNotIn(List<Date> values) {
            addCriterion("facility_pdate not in", values, "facilityPdate");
            return (Criteria) this;
        }

        public Criteria andFacilityPdateBetween(Date value1, Date value2) {
            addCriterion("facility_pdate between", value1, value2, "facilityPdate");
            return (Criteria) this;
        }

        public Criteria andFacilityPdateNotBetween(Date value1, Date value2) {
            addCriterion("facility_pdate not between", value1, value2, "facilityPdate");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeIsNull() {
            addCriterion("facility_code is null");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeIsNotNull() {
            addCriterion("facility_code is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeEqualTo(String value) {
            addCriterion("facility_code =", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeNotEqualTo(String value) {
            addCriterion("facility_code <>", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeGreaterThan(String value) {
            addCriterion("facility_code >", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("facility_code >=", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeLessThan(String value) {
            addCriterion("facility_code <", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeLessThanOrEqualTo(String value) {
            addCriterion("facility_code <=", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeLike(String value) {
            addCriterion("facility_code like", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeNotLike(String value) {
            addCriterion("facility_code not like", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeIn(List<String> values) {
            addCriterion("facility_code in", values, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeNotIn(List<String> values) {
            addCriterion("facility_code not in", values, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeBetween(String value1, String value2) {
            addCriterion("facility_code between", value1, value2, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeNotBetween(String value1, String value2) {
            addCriterion("facility_code not between", value1, value2, "facilityCode");
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