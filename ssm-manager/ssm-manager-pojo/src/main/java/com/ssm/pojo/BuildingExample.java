package com.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuildingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuildingExample() {
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

        public Criteria andBuildingIdIsNull() {
            addCriterion("building_id is null");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIsNotNull() {
            addCriterion("building_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingIdEqualTo(Integer value) {
            addCriterion("building_id =", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotEqualTo(Integer value) {
            addCriterion("building_id <>", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdGreaterThan(Integer value) {
            addCriterion("building_id >", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("building_id >=", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLessThan(Integer value) {
            addCriterion("building_id <", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLessThanOrEqualTo(Integer value) {
            addCriterion("building_id <=", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIn(List<Integer> values) {
            addCriterion("building_id in", values, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotIn(List<Integer> values) {
            addCriterion("building_id not in", values, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdBetween(Integer value1, Integer value2) {
            addCriterion("building_id between", value1, value2, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("building_id not between", value1, value2, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNull() {
            addCriterion("building_name is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNotNull() {
            addCriterion("building_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameEqualTo(String value) {
            addCriterion("building_name =", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotEqualTo(String value) {
            addCriterion("building_name <>", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThan(String value) {
            addCriterion("building_name >", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThanOrEqualTo(String value) {
            addCriterion("building_name >=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThan(String value) {
            addCriterion("building_name <", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThanOrEqualTo(String value) {
            addCriterion("building_name <=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLike(String value) {
            addCriterion("building_name like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotLike(String value) {
            addCriterion("building_name not like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIn(List<String> values) {
            addCriterion("building_name in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotIn(List<String> values) {
            addCriterion("building_name not in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameBetween(String value1, String value2) {
            addCriterion("building_name between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotBetween(String value1, String value2) {
            addCriterion("building_name not between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingDatetimeIsNull() {
            addCriterion("building_datetime is null");
            return (Criteria) this;
        }

        public Criteria andBuildingDatetimeIsNotNull() {
            addCriterion("building_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingDatetimeEqualTo(Date value) {
            addCriterion("building_datetime =", value, "buildingDatetime");
            return (Criteria) this;
        }

        public Criteria andBuildingDatetimeNotEqualTo(Date value) {
            addCriterion("building_datetime <>", value, "buildingDatetime");
            return (Criteria) this;
        }

        public Criteria andBuildingDatetimeGreaterThan(Date value) {
            addCriterion("building_datetime >", value, "buildingDatetime");
            return (Criteria) this;
        }

        public Criteria andBuildingDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("building_datetime >=", value, "buildingDatetime");
            return (Criteria) this;
        }

        public Criteria andBuildingDatetimeLessThan(Date value) {
            addCriterion("building_datetime <", value, "buildingDatetime");
            return (Criteria) this;
        }

        public Criteria andBuildingDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("building_datetime <=", value, "buildingDatetime");
            return (Criteria) this;
        }

        public Criteria andBuildingDatetimeIn(List<Date> values) {
            addCriterion("building_datetime in", values, "buildingDatetime");
            return (Criteria) this;
        }

        public Criteria andBuildingDatetimeNotIn(List<Date> values) {
            addCriterion("building_datetime not in", values, "buildingDatetime");
            return (Criteria) this;
        }

        public Criteria andBuildingDatetimeBetween(Date value1, Date value2) {
            addCriterion("building_datetime between", value1, value2, "buildingDatetime");
            return (Criteria) this;
        }

        public Criteria andBuildingDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("building_datetime not between", value1, value2, "buildingDatetime");
            return (Criteria) this;
        }

        public Criteria andBuildingLayerIsNull() {
            addCriterion("building_layer is null");
            return (Criteria) this;
        }

        public Criteria andBuildingLayerIsNotNull() {
            addCriterion("building_layer is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingLayerEqualTo(Integer value) {
            addCriterion("building_layer =", value, "buildingLayer");
            return (Criteria) this;
        }

        public Criteria andBuildingLayerNotEqualTo(Integer value) {
            addCriterion("building_layer <>", value, "buildingLayer");
            return (Criteria) this;
        }

        public Criteria andBuildingLayerGreaterThan(Integer value) {
            addCriterion("building_layer >", value, "buildingLayer");
            return (Criteria) this;
        }

        public Criteria andBuildingLayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("building_layer >=", value, "buildingLayer");
            return (Criteria) this;
        }

        public Criteria andBuildingLayerLessThan(Integer value) {
            addCriterion("building_layer <", value, "buildingLayer");
            return (Criteria) this;
        }

        public Criteria andBuildingLayerLessThanOrEqualTo(Integer value) {
            addCriterion("building_layer <=", value, "buildingLayer");
            return (Criteria) this;
        }

        public Criteria andBuildingLayerIn(List<Integer> values) {
            addCriterion("building_layer in", values, "buildingLayer");
            return (Criteria) this;
        }

        public Criteria andBuildingLayerNotIn(List<Integer> values) {
            addCriterion("building_layer not in", values, "buildingLayer");
            return (Criteria) this;
        }

        public Criteria andBuildingLayerBetween(Integer value1, Integer value2) {
            addCriterion("building_layer between", value1, value2, "buildingLayer");
            return (Criteria) this;
        }

        public Criteria andBuildingLayerNotBetween(Integer value1, Integer value2) {
            addCriterion("building_layer not between", value1, value2, "buildingLayer");
            return (Criteria) this;
        }

        public Criteria andBuidlingAreaIsNull() {
            addCriterion("buidling_area is null");
            return (Criteria) this;
        }

        public Criteria andBuidlingAreaIsNotNull() {
            addCriterion("buidling_area is not null");
            return (Criteria) this;
        }

        public Criteria andBuidlingAreaEqualTo(Float value) {
            addCriterion("buidling_area =", value, "buidlingArea");
            return (Criteria) this;
        }

        public Criteria andBuidlingAreaNotEqualTo(Float value) {
            addCriterion("buidling_area <>", value, "buidlingArea");
            return (Criteria) this;
        }

        public Criteria andBuidlingAreaGreaterThan(Float value) {
            addCriterion("buidling_area >", value, "buidlingArea");
            return (Criteria) this;
        }

        public Criteria andBuidlingAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("buidling_area >=", value, "buidlingArea");
            return (Criteria) this;
        }

        public Criteria andBuidlingAreaLessThan(Float value) {
            addCriterion("buidling_area <", value, "buidlingArea");
            return (Criteria) this;
        }

        public Criteria andBuidlingAreaLessThanOrEqualTo(Float value) {
            addCriterion("buidling_area <=", value, "buidlingArea");
            return (Criteria) this;
        }

        public Criteria andBuidlingAreaIn(List<Float> values) {
            addCriterion("buidling_area in", values, "buidlingArea");
            return (Criteria) this;
        }

        public Criteria andBuidlingAreaNotIn(List<Float> values) {
            addCriterion("buidling_area not in", values, "buidlingArea");
            return (Criteria) this;
        }

        public Criteria andBuidlingAreaBetween(Float value1, Float value2) {
            addCriterion("buidling_area between", value1, value2, "buidlingArea");
            return (Criteria) this;
        }

        public Criteria andBuidlingAreaNotBetween(Float value1, Float value2) {
            addCriterion("buidling_area not between", value1, value2, "buidlingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeIsNull() {
            addCriterion("building_code is null");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeIsNotNull() {
            addCriterion("building_code is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeEqualTo(String value) {
            addCriterion("building_code =", value, "buildingCode");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeNotEqualTo(String value) {
            addCriterion("building_code <>", value, "buildingCode");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeGreaterThan(String value) {
            addCriterion("building_code >", value, "buildingCode");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("building_code >=", value, "buildingCode");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeLessThan(String value) {
            addCriterion("building_code <", value, "buildingCode");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeLessThanOrEqualTo(String value) {
            addCriterion("building_code <=", value, "buildingCode");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeLike(String value) {
            addCriterion("building_code like", value, "buildingCode");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeNotLike(String value) {
            addCriterion("building_code not like", value, "buildingCode");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeIn(List<String> values) {
            addCriterion("building_code in", values, "buildingCode");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeNotIn(List<String> values) {
            addCriterion("building_code not in", values, "buildingCode");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeBetween(String value1, String value2) {
            addCriterion("building_code between", value1, value2, "buildingCode");
            return (Criteria) this;
        }

        public Criteria andBuildingCodeNotBetween(String value1, String value2) {
            addCriterion("building_code not between", value1, value2, "buildingCode");
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