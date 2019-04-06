package com.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChargefeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargefeeExample() {
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

        public Criteria andFeeIdIsNull() {
            addCriterion("fee_id is null");
            return (Criteria) this;
        }

        public Criteria andFeeIdIsNotNull() {
            addCriterion("fee_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeeIdEqualTo(Integer value) {
            addCriterion("fee_id =", value, "feeId");
            return (Criteria) this;
        }

        public Criteria andFeeIdNotEqualTo(Integer value) {
            addCriterion("fee_id <>", value, "feeId");
            return (Criteria) this;
        }

        public Criteria andFeeIdGreaterThan(Integer value) {
            addCriterion("fee_id >", value, "feeId");
            return (Criteria) this;
        }

        public Criteria andFeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_id >=", value, "feeId");
            return (Criteria) this;
        }

        public Criteria andFeeIdLessThan(Integer value) {
            addCriterion("fee_id <", value, "feeId");
            return (Criteria) this;
        }

        public Criteria andFeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("fee_id <=", value, "feeId");
            return (Criteria) this;
        }

        public Criteria andFeeIdIn(List<Integer> values) {
            addCriterion("fee_id in", values, "feeId");
            return (Criteria) this;
        }

        public Criteria andFeeIdNotIn(List<Integer> values) {
            addCriterion("fee_id not in", values, "feeId");
            return (Criteria) this;
        }

        public Criteria andFeeIdBetween(Integer value1, Integer value2) {
            addCriterion("fee_id between", value1, value2, "feeId");
            return (Criteria) this;
        }

        public Criteria andFeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_id not between", value1, value2, "feeId");
            return (Criteria) this;
        }

        public Criteria andFeeCodeIsNull() {
            addCriterion("fee_code is null");
            return (Criteria) this;
        }

        public Criteria andFeeCodeIsNotNull() {
            addCriterion("fee_code is not null");
            return (Criteria) this;
        }

        public Criteria andFeeCodeEqualTo(String value) {
            addCriterion("fee_code =", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeNotEqualTo(String value) {
            addCriterion("fee_code <>", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeGreaterThan(String value) {
            addCriterion("fee_code >", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fee_code >=", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeLessThan(String value) {
            addCriterion("fee_code <", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeLessThanOrEqualTo(String value) {
            addCriterion("fee_code <=", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeLike(String value) {
            addCriterion("fee_code like", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeNotLike(String value) {
            addCriterion("fee_code not like", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeIn(List<String> values) {
            addCriterion("fee_code in", values, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeNotIn(List<String> values) {
            addCriterion("fee_code not in", values, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeBetween(String value1, String value2) {
            addCriterion("fee_code between", value1, value2, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeNotBetween(String value1, String value2) {
            addCriterion("fee_code not between", value1, value2, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNull() {
            addCriterion("fee_type is null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNotNull() {
            addCriterion("fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeEqualTo(String value) {
            addCriterion("fee_type =", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotEqualTo(String value) {
            addCriterion("fee_type <>", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThan(String value) {
            addCriterion("fee_type >", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fee_type >=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThan(String value) {
            addCriterion("fee_type <", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("fee_type <=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLike(String value) {
            addCriterion("fee_type like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotLike(String value) {
            addCriterion("fee_type not like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIn(List<String> values) {
            addCriterion("fee_type in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotIn(List<String> values) {
            addCriterion("fee_type not in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeBetween(String value1, String value2) {
            addCriterion("fee_type between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotBetween(String value1, String value2) {
            addCriterion("fee_type not between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Long value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Long value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Long value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Long value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Long value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Long> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Long> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Long value1, Long value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Long value1, Long value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andFactpaymentIsNull() {
            addCriterion("factpayment is null");
            return (Criteria) this;
        }

        public Criteria andFactpaymentIsNotNull() {
            addCriterion("factpayment is not null");
            return (Criteria) this;
        }

        public Criteria andFactpaymentEqualTo(Long value) {
            addCriterion("factpayment =", value, "factpayment");
            return (Criteria) this;
        }

        public Criteria andFactpaymentNotEqualTo(Long value) {
            addCriterion("factpayment <>", value, "factpayment");
            return (Criteria) this;
        }

        public Criteria andFactpaymentGreaterThan(Long value) {
            addCriterion("factpayment >", value, "factpayment");
            return (Criteria) this;
        }

        public Criteria andFactpaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("factpayment >=", value, "factpayment");
            return (Criteria) this;
        }

        public Criteria andFactpaymentLessThan(Long value) {
            addCriterion("factpayment <", value, "factpayment");
            return (Criteria) this;
        }

        public Criteria andFactpaymentLessThanOrEqualTo(Long value) {
            addCriterion("factpayment <=", value, "factpayment");
            return (Criteria) this;
        }

        public Criteria andFactpaymentIn(List<Long> values) {
            addCriterion("factpayment in", values, "factpayment");
            return (Criteria) this;
        }

        public Criteria andFactpaymentNotIn(List<Long> values) {
            addCriterion("factpayment not in", values, "factpayment");
            return (Criteria) this;
        }

        public Criteria andFactpaymentBetween(Long value1, Long value2) {
            addCriterion("factpayment between", value1, value2, "factpayment");
            return (Criteria) this;
        }

        public Criteria andFactpaymentNotBetween(Long value1, Long value2) {
            addCriterion("factpayment not between", value1, value2, "factpayment");
            return (Criteria) this;
        }

        public Criteria andNotpaymentIsNull() {
            addCriterion("notpayment is null");
            return (Criteria) this;
        }

        public Criteria andNotpaymentIsNotNull() {
            addCriterion("notpayment is not null");
            return (Criteria) this;
        }

        public Criteria andNotpaymentEqualTo(Long value) {
            addCriterion("notpayment =", value, "notpayment");
            return (Criteria) this;
        }

        public Criteria andNotpaymentNotEqualTo(Long value) {
            addCriterion("notpayment <>", value, "notpayment");
            return (Criteria) this;
        }

        public Criteria andNotpaymentGreaterThan(Long value) {
            addCriterion("notpayment >", value, "notpayment");
            return (Criteria) this;
        }

        public Criteria andNotpaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("notpayment >=", value, "notpayment");
            return (Criteria) this;
        }

        public Criteria andNotpaymentLessThan(Long value) {
            addCriterion("notpayment <", value, "notpayment");
            return (Criteria) this;
        }

        public Criteria andNotpaymentLessThanOrEqualTo(Long value) {
            addCriterion("notpayment <=", value, "notpayment");
            return (Criteria) this;
        }

        public Criteria andNotpaymentIn(List<Long> values) {
            addCriterion("notpayment in", values, "notpayment");
            return (Criteria) this;
        }

        public Criteria andNotpaymentNotIn(List<Long> values) {
            addCriterion("notpayment not in", values, "notpayment");
            return (Criteria) this;
        }

        public Criteria andNotpaymentBetween(Long value1, Long value2) {
            addCriterion("notpayment between", value1, value2, "notpayment");
            return (Criteria) this;
        }

        public Criteria andNotpaymentNotBetween(Long value1, Long value2) {
            addCriterion("notpayment not between", value1, value2, "notpayment");
            return (Criteria) this;
        }

        public Criteria andRemainingIsNull() {
            addCriterion("remaining is null");
            return (Criteria) this;
        }

        public Criteria andRemainingIsNotNull() {
            addCriterion("remaining is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingEqualTo(Long value) {
            addCriterion("remaining =", value, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingNotEqualTo(Long value) {
            addCriterion("remaining <>", value, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingGreaterThan(Long value) {
            addCriterion("remaining >", value, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingGreaterThanOrEqualTo(Long value) {
            addCriterion("remaining >=", value, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingLessThan(Long value) {
            addCriterion("remaining <", value, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingLessThanOrEqualTo(Long value) {
            addCriterion("remaining <=", value, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingIn(List<Long> values) {
            addCriterion("remaining in", values, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingNotIn(List<Long> values) {
            addCriterion("remaining not in", values, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingBetween(Long value1, Long value2) {
            addCriterion("remaining between", value1, value2, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingNotBetween(Long value1, Long value2) {
            addCriterion("remaining not between", value1, value2, "remaining");
            return (Criteria) this;
        }

        public Criteria andCurrentdateIsNull() {
            addCriterion("currentdate is null");
            return (Criteria) this;
        }

        public Criteria andCurrentdateIsNotNull() {
            addCriterion("currentdate is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentdateEqualTo(Date value) {
            addCriterion("currentdate =", value, "currentdate");
            return (Criteria) this;
        }

        public Criteria andCurrentdateNotEqualTo(Date value) {
            addCriterion("currentdate <>", value, "currentdate");
            return (Criteria) this;
        }

        public Criteria andCurrentdateGreaterThan(Date value) {
            addCriterion("currentdate >", value, "currentdate");
            return (Criteria) this;
        }

        public Criteria andCurrentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("currentdate >=", value, "currentdate");
            return (Criteria) this;
        }

        public Criteria andCurrentdateLessThan(Date value) {
            addCriterion("currentdate <", value, "currentdate");
            return (Criteria) this;
        }

        public Criteria andCurrentdateLessThanOrEqualTo(Date value) {
            addCriterion("currentdate <=", value, "currentdate");
            return (Criteria) this;
        }

        public Criteria andCurrentdateIn(List<Date> values) {
            addCriterion("currentdate in", values, "currentdate");
            return (Criteria) this;
        }

        public Criteria andCurrentdateNotIn(List<Date> values) {
            addCriterion("currentdate not in", values, "currentdate");
            return (Criteria) this;
        }

        public Criteria andCurrentdateBetween(Date value1, Date value2) {
            addCriterion("currentdate between", value1, value2, "currentdate");
            return (Criteria) this;
        }

        public Criteria andCurrentdateNotBetween(Date value1, Date value2) {
            addCriterion("currentdate not between", value1, value2, "currentdate");
            return (Criteria) this;
        }

        public Criteria andHandleIsNull() {
            addCriterion("handle is null");
            return (Criteria) this;
        }

        public Criteria andHandleIsNotNull() {
            addCriterion("handle is not null");
            return (Criteria) this;
        }

        public Criteria andHandleEqualTo(String value) {
            addCriterion("handle =", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleNotEqualTo(String value) {
            addCriterion("handle <>", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleGreaterThan(String value) {
            addCriterion("handle >", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleGreaterThanOrEqualTo(String value) {
            addCriterion("handle >=", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleLessThan(String value) {
            addCriterion("handle <", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleLessThanOrEqualTo(String value) {
            addCriterion("handle <=", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleLike(String value) {
            addCriterion("handle like", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleNotLike(String value) {
            addCriterion("handle not like", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleIn(List<String> values) {
            addCriterion("handle in", values, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleNotIn(List<String> values) {
            addCriterion("handle not in", values, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleBetween(String value1, String value2) {
            addCriterion("handle between", value1, value2, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleNotBetween(String value1, String value2) {
            addCriterion("handle not between", value1, value2, "handle");
            return (Criteria) this;
        }

        public Criteria andBeforedateIsNull() {
            addCriterion("beforedate is null");
            return (Criteria) this;
        }

        public Criteria andBeforedateIsNotNull() {
            addCriterion("beforedate is not null");
            return (Criteria) this;
        }

        public Criteria andBeforedateEqualTo(Date value) {
            addCriterion("beforedate =", value, "beforedate");
            return (Criteria) this;
        }

        public Criteria andBeforedateNotEqualTo(Date value) {
            addCriterion("beforedate <>", value, "beforedate");
            return (Criteria) this;
        }

        public Criteria andBeforedateGreaterThan(Date value) {
            addCriterion("beforedate >", value, "beforedate");
            return (Criteria) this;
        }

        public Criteria andBeforedateGreaterThanOrEqualTo(Date value) {
            addCriterion("beforedate >=", value, "beforedate");
            return (Criteria) this;
        }

        public Criteria andBeforedateLessThan(Date value) {
            addCriterion("beforedate <", value, "beforedate");
            return (Criteria) this;
        }

        public Criteria andBeforedateLessThanOrEqualTo(Date value) {
            addCriterion("beforedate <=", value, "beforedate");
            return (Criteria) this;
        }

        public Criteria andBeforedateIn(List<Date> values) {
            addCriterion("beforedate in", values, "beforedate");
            return (Criteria) this;
        }

        public Criteria andBeforedateNotIn(List<Date> values) {
            addCriterion("beforedate not in", values, "beforedate");
            return (Criteria) this;
        }

        public Criteria andBeforedateBetween(Date value1, Date value2) {
            addCriterion("beforedate between", value1, value2, "beforedate");
            return (Criteria) this;
        }

        public Criteria andBeforedateNotBetween(Date value1, Date value2) {
            addCriterion("beforedate not between", value1, value2, "beforedate");
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