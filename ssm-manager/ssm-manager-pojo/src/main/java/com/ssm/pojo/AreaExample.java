package com.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaExample() {
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaBuildtimeIsNull() {
            addCriterion("area_buildtime is null");
            return (Criteria) this;
        }

        public Criteria andAreaBuildtimeIsNotNull() {
            addCriterion("area_buildtime is not null");
            return (Criteria) this;
        }

        public Criteria andAreaBuildtimeEqualTo(Date value) {
            addCriterion("area_buildtime =", value, "areaBuildtime");
            return (Criteria) this;
        }

        public Criteria andAreaBuildtimeNotEqualTo(Date value) {
            addCriterion("area_buildtime <>", value, "areaBuildtime");
            return (Criteria) this;
        }

        public Criteria andAreaBuildtimeGreaterThan(Date value) {
            addCriterion("area_buildtime >", value, "areaBuildtime");
            return (Criteria) this;
        }

        public Criteria andAreaBuildtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("area_buildtime >=", value, "areaBuildtime");
            return (Criteria) this;
        }

        public Criteria andAreaBuildtimeLessThan(Date value) {
            addCriterion("area_buildtime <", value, "areaBuildtime");
            return (Criteria) this;
        }

        public Criteria andAreaBuildtimeLessThanOrEqualTo(Date value) {
            addCriterion("area_buildtime <=", value, "areaBuildtime");
            return (Criteria) this;
        }

        public Criteria andAreaBuildtimeIn(List<Date> values) {
            addCriterion("area_buildtime in", values, "areaBuildtime");
            return (Criteria) this;
        }

        public Criteria andAreaBuildtimeNotIn(List<Date> values) {
            addCriterion("area_buildtime not in", values, "areaBuildtime");
            return (Criteria) this;
        }

        public Criteria andAreaBuildtimeBetween(Date value1, Date value2) {
            addCriterion("area_buildtime between", value1, value2, "areaBuildtime");
            return (Criteria) this;
        }

        public Criteria andAreaBuildtimeNotBetween(Date value1, Date value2) {
            addCriterion("area_buildtime not between", value1, value2, "areaBuildtime");
            return (Criteria) this;
        }

        public Criteria andAreaAddrIsNull() {
            addCriterion("area_addr is null");
            return (Criteria) this;
        }

        public Criteria andAreaAddrIsNotNull() {
            addCriterion("area_addr is not null");
            return (Criteria) this;
        }

        public Criteria andAreaAddrEqualTo(String value) {
            addCriterion("area_addr =", value, "areaAddr");
            return (Criteria) this;
        }

        public Criteria andAreaAddrNotEqualTo(String value) {
            addCriterion("area_addr <>", value, "areaAddr");
            return (Criteria) this;
        }

        public Criteria andAreaAddrGreaterThan(String value) {
            addCriterion("area_addr >", value, "areaAddr");
            return (Criteria) this;
        }

        public Criteria andAreaAddrGreaterThanOrEqualTo(String value) {
            addCriterion("area_addr >=", value, "areaAddr");
            return (Criteria) this;
        }

        public Criteria andAreaAddrLessThan(String value) {
            addCriterion("area_addr <", value, "areaAddr");
            return (Criteria) this;
        }

        public Criteria andAreaAddrLessThanOrEqualTo(String value) {
            addCriterion("area_addr <=", value, "areaAddr");
            return (Criteria) this;
        }

        public Criteria andAreaAddrLike(String value) {
            addCriterion("area_addr like", value, "areaAddr");
            return (Criteria) this;
        }

        public Criteria andAreaAddrNotLike(String value) {
            addCriterion("area_addr not like", value, "areaAddr");
            return (Criteria) this;
        }

        public Criteria andAreaAddrIn(List<String> values) {
            addCriterion("area_addr in", values, "areaAddr");
            return (Criteria) this;
        }

        public Criteria andAreaAddrNotIn(List<String> values) {
            addCriterion("area_addr not in", values, "areaAddr");
            return (Criteria) this;
        }

        public Criteria andAreaAddrBetween(String value1, String value2) {
            addCriterion("area_addr between", value1, value2, "areaAddr");
            return (Criteria) this;
        }

        public Criteria andAreaAddrNotBetween(String value1, String value2) {
            addCriterion("area_addr not between", value1, value2, "areaAddr");
            return (Criteria) this;
        }

        public Criteria andAreaSizeIsNull() {
            addCriterion("area_size is null");
            return (Criteria) this;
        }

        public Criteria andAreaSizeIsNotNull() {
            addCriterion("area_size is not null");
            return (Criteria) this;
        }

        public Criteria andAreaSizeEqualTo(Float value) {
            addCriterion("area_size =", value, "areaSize");
            return (Criteria) this;
        }

        public Criteria andAreaSizeNotEqualTo(Float value) {
            addCriterion("area_size <>", value, "areaSize");
            return (Criteria) this;
        }

        public Criteria andAreaSizeGreaterThan(Float value) {
            addCriterion("area_size >", value, "areaSize");
            return (Criteria) this;
        }

        public Criteria andAreaSizeGreaterThanOrEqualTo(Float value) {
            addCriterion("area_size >=", value, "areaSize");
            return (Criteria) this;
        }

        public Criteria andAreaSizeLessThan(Float value) {
            addCriterion("area_size <", value, "areaSize");
            return (Criteria) this;
        }

        public Criteria andAreaSizeLessThanOrEqualTo(Float value) {
            addCriterion("area_size <=", value, "areaSize");
            return (Criteria) this;
        }

        public Criteria andAreaSizeIn(List<Float> values) {
            addCriterion("area_size in", values, "areaSize");
            return (Criteria) this;
        }

        public Criteria andAreaSizeNotIn(List<Float> values) {
            addCriterion("area_size not in", values, "areaSize");
            return (Criteria) this;
        }

        public Criteria andAreaSizeBetween(Float value1, Float value2) {
            addCriterion("area_size between", value1, value2, "areaSize");
            return (Criteria) this;
        }

        public Criteria andAreaSizeNotBetween(Float value1, Float value2) {
            addCriterion("area_size not between", value1, value2, "areaSize");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadIsNull() {
            addCriterion("area_mainhead is null");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadIsNotNull() {
            addCriterion("area_mainhead is not null");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadEqualTo(String value) {
            addCriterion("area_mainhead =", value, "areaMainhead");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadNotEqualTo(String value) {
            addCriterion("area_mainhead <>", value, "areaMainhead");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadGreaterThan(String value) {
            addCriterion("area_mainhead >", value, "areaMainhead");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadGreaterThanOrEqualTo(String value) {
            addCriterion("area_mainhead >=", value, "areaMainhead");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadLessThan(String value) {
            addCriterion("area_mainhead <", value, "areaMainhead");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadLessThanOrEqualTo(String value) {
            addCriterion("area_mainhead <=", value, "areaMainhead");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadLike(String value) {
            addCriterion("area_mainhead like", value, "areaMainhead");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadNotLike(String value) {
            addCriterion("area_mainhead not like", value, "areaMainhead");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadIn(List<String> values) {
            addCriterion("area_mainhead in", values, "areaMainhead");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadNotIn(List<String> values) {
            addCriterion("area_mainhead not in", values, "areaMainhead");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadBetween(String value1, String value2) {
            addCriterion("area_mainhead between", value1, value2, "areaMainhead");
            return (Criteria) this;
        }

        public Criteria andAreaMainheadNotBetween(String value1, String value2) {
            addCriterion("area_mainhead not between", value1, value2, "areaMainhead");
            return (Criteria) this;
        }

        public Criteria andAreaAmountIsNull() {
            addCriterion("area_amount is null");
            return (Criteria) this;
        }

        public Criteria andAreaAmountIsNotNull() {
            addCriterion("area_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAreaAmountEqualTo(Integer value) {
            addCriterion("area_amount =", value, "areaAmount");
            return (Criteria) this;
        }

        public Criteria andAreaAmountNotEqualTo(Integer value) {
            addCriterion("area_amount <>", value, "areaAmount");
            return (Criteria) this;
        }

        public Criteria andAreaAmountGreaterThan(Integer value) {
            addCriterion("area_amount >", value, "areaAmount");
            return (Criteria) this;
        }

        public Criteria andAreaAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_amount >=", value, "areaAmount");
            return (Criteria) this;
        }

        public Criteria andAreaAmountLessThan(Integer value) {
            addCriterion("area_amount <", value, "areaAmount");
            return (Criteria) this;
        }

        public Criteria andAreaAmountLessThanOrEqualTo(Integer value) {
            addCriterion("area_amount <=", value, "areaAmount");
            return (Criteria) this;
        }

        public Criteria andAreaAmountIn(List<Integer> values) {
            addCriterion("area_amount in", values, "areaAmount");
            return (Criteria) this;
        }

        public Criteria andAreaAmountNotIn(List<Integer> values) {
            addCriterion("area_amount not in", values, "areaAmount");
            return (Criteria) this;
        }

        public Criteria andAreaAmountBetween(Integer value1, Integer value2) {
            addCriterion("area_amount between", value1, value2, "areaAmount");
            return (Criteria) this;
        }

        public Criteria andAreaAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("area_amount not between", value1, value2, "areaAmount");
            return (Criteria) this;
        }

        public Criteria andAreaParkingIsNull() {
            addCriterion("area_parking is null");
            return (Criteria) this;
        }

        public Criteria andAreaParkingIsNotNull() {
            addCriterion("area_parking is not null");
            return (Criteria) this;
        }

        public Criteria andAreaParkingEqualTo(Float value) {
            addCriterion("area_parking =", value, "areaParking");
            return (Criteria) this;
        }

        public Criteria andAreaParkingNotEqualTo(Float value) {
            addCriterion("area_parking <>", value, "areaParking");
            return (Criteria) this;
        }

        public Criteria andAreaParkingGreaterThan(Float value) {
            addCriterion("area_parking >", value, "areaParking");
            return (Criteria) this;
        }

        public Criteria andAreaParkingGreaterThanOrEqualTo(Float value) {
            addCriterion("area_parking >=", value, "areaParking");
            return (Criteria) this;
        }

        public Criteria andAreaParkingLessThan(Float value) {
            addCriterion("area_parking <", value, "areaParking");
            return (Criteria) this;
        }

        public Criteria andAreaParkingLessThanOrEqualTo(Float value) {
            addCriterion("area_parking <=", value, "areaParking");
            return (Criteria) this;
        }

        public Criteria andAreaParkingIn(List<Float> values) {
            addCriterion("area_parking in", values, "areaParking");
            return (Criteria) this;
        }

        public Criteria andAreaParkingNotIn(List<Float> values) {
            addCriterion("area_parking not in", values, "areaParking");
            return (Criteria) this;
        }

        public Criteria andAreaParkingBetween(Float value1, Float value2) {
            addCriterion("area_parking between", value1, value2, "areaParking");
            return (Criteria) this;
        }

        public Criteria andAreaParkingNotBetween(Float value1, Float value2) {
            addCriterion("area_parking not between", value1, value2, "areaParking");
            return (Criteria) this;
        }

        public Criteria andAreaGreenIsNull() {
            addCriterion("area_green is null");
            return (Criteria) this;
        }

        public Criteria andAreaGreenIsNotNull() {
            addCriterion("area_green is not null");
            return (Criteria) this;
        }

        public Criteria andAreaGreenEqualTo(Float value) {
            addCriterion("area_green =", value, "areaGreen");
            return (Criteria) this;
        }

        public Criteria andAreaGreenNotEqualTo(Float value) {
            addCriterion("area_green <>", value, "areaGreen");
            return (Criteria) this;
        }

        public Criteria andAreaGreenGreaterThan(Float value) {
            addCriterion("area_green >", value, "areaGreen");
            return (Criteria) this;
        }

        public Criteria andAreaGreenGreaterThanOrEqualTo(Float value) {
            addCriterion("area_green >=", value, "areaGreen");
            return (Criteria) this;
        }

        public Criteria andAreaGreenLessThan(Float value) {
            addCriterion("area_green <", value, "areaGreen");
            return (Criteria) this;
        }

        public Criteria andAreaGreenLessThanOrEqualTo(Float value) {
            addCriterion("area_green <=", value, "areaGreen");
            return (Criteria) this;
        }

        public Criteria andAreaGreenIn(List<Float> values) {
            addCriterion("area_green in", values, "areaGreen");
            return (Criteria) this;
        }

        public Criteria andAreaGreenNotIn(List<Float> values) {
            addCriterion("area_green not in", values, "areaGreen");
            return (Criteria) this;
        }

        public Criteria andAreaGreenBetween(Float value1, Float value2) {
            addCriterion("area_green between", value1, value2, "areaGreen");
            return (Criteria) this;
        }

        public Criteria andAreaGreenNotBetween(Float value1, Float value2) {
            addCriterion("area_green not between", value1, value2, "areaGreen");
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