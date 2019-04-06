package com.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminidIsNull() {
            addCriterion("adminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("adminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("adminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("adminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("adminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("adminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("adminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("adminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("adminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminId not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNull() {
            addCriterion("admin_sex is null");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNotNull() {
            addCriterion("admin_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAdminSexEqualTo(String value) {
            addCriterion("admin_sex =", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotEqualTo(String value) {
            addCriterion("admin_sex <>", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThan(String value) {
            addCriterion("admin_sex >", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThanOrEqualTo(String value) {
            addCriterion("admin_sex >=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThan(String value) {
            addCriterion("admin_sex <", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThanOrEqualTo(String value) {
            addCriterion("admin_sex <=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLike(String value) {
            addCriterion("admin_sex like", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotLike(String value) {
            addCriterion("admin_sex not like", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexIn(List<String> values) {
            addCriterion("admin_sex in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotIn(List<String> values) {
            addCriterion("admin_sex not in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexBetween(String value1, String value2) {
            addCriterion("admin_sex between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotBetween(String value1, String value2) {
            addCriterion("admin_sex not between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminAgeIsNull() {
            addCriterion("admin_age is null");
            return (Criteria) this;
        }

        public Criteria andAdminAgeIsNotNull() {
            addCriterion("admin_age is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAgeEqualTo(Integer value) {
            addCriterion("admin_age =", value, "adminAge");
            return (Criteria) this;
        }

        public Criteria andAdminAgeNotEqualTo(Integer value) {
            addCriterion("admin_age <>", value, "adminAge");
            return (Criteria) this;
        }

        public Criteria andAdminAgeGreaterThan(Integer value) {
            addCriterion("admin_age >", value, "adminAge");
            return (Criteria) this;
        }

        public Criteria andAdminAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_age >=", value, "adminAge");
            return (Criteria) this;
        }

        public Criteria andAdminAgeLessThan(Integer value) {
            addCriterion("admin_age <", value, "adminAge");
            return (Criteria) this;
        }

        public Criteria andAdminAgeLessThanOrEqualTo(Integer value) {
            addCriterion("admin_age <=", value, "adminAge");
            return (Criteria) this;
        }

        public Criteria andAdminAgeIn(List<Integer> values) {
            addCriterion("admin_age in", values, "adminAge");
            return (Criteria) this;
        }

        public Criteria andAdminAgeNotIn(List<Integer> values) {
            addCriterion("admin_age not in", values, "adminAge");
            return (Criteria) this;
        }

        public Criteria andAdminAgeBetween(Integer value1, Integer value2) {
            addCriterion("admin_age between", value1, value2, "adminAge");
            return (Criteria) this;
        }

        public Criteria andAdminAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_age not between", value1, value2, "adminAge");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNull() {
            addCriterion("admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNotNull() {
            addCriterion("admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneEqualTo(String value) {
            addCriterion("admin_phone =", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotEqualTo(String value) {
            addCriterion("admin_phone <>", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThan(String value) {
            addCriterion("admin_phone >", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_phone >=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThan(String value) {
            addCriterion("admin_phone <", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_phone <=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLike(String value) {
            addCriterion("admin_phone like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotLike(String value) {
            addCriterion("admin_phone not like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIn(List<String> values) {
            addCriterion("admin_phone in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotIn(List<String> values) {
            addCriterion("admin_phone not in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneBetween(String value1, String value2) {
            addCriterion("admin_phone between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("admin_phone not between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminWxIsNull() {
            addCriterion("admin_wx is null");
            return (Criteria) this;
        }

        public Criteria andAdminWxIsNotNull() {
            addCriterion("admin_wx is not null");
            return (Criteria) this;
        }

        public Criteria andAdminWxEqualTo(String value) {
            addCriterion("admin_wx =", value, "adminWx");
            return (Criteria) this;
        }

        public Criteria andAdminWxNotEqualTo(String value) {
            addCriterion("admin_wx <>", value, "adminWx");
            return (Criteria) this;
        }

        public Criteria andAdminWxGreaterThan(String value) {
            addCriterion("admin_wx >", value, "adminWx");
            return (Criteria) this;
        }

        public Criteria andAdminWxGreaterThanOrEqualTo(String value) {
            addCriterion("admin_wx >=", value, "adminWx");
            return (Criteria) this;
        }

        public Criteria andAdminWxLessThan(String value) {
            addCriterion("admin_wx <", value, "adminWx");
            return (Criteria) this;
        }

        public Criteria andAdminWxLessThanOrEqualTo(String value) {
            addCriterion("admin_wx <=", value, "adminWx");
            return (Criteria) this;
        }

        public Criteria andAdminWxLike(String value) {
            addCriterion("admin_wx like", value, "adminWx");
            return (Criteria) this;
        }

        public Criteria andAdminWxNotLike(String value) {
            addCriterion("admin_wx not like", value, "adminWx");
            return (Criteria) this;
        }

        public Criteria andAdminWxIn(List<String> values) {
            addCriterion("admin_wx in", values, "adminWx");
            return (Criteria) this;
        }

        public Criteria andAdminWxNotIn(List<String> values) {
            addCriterion("admin_wx not in", values, "adminWx");
            return (Criteria) this;
        }

        public Criteria andAdminWxBetween(String value1, String value2) {
            addCriterion("admin_wx between", value1, value2, "adminWx");
            return (Criteria) this;
        }

        public Criteria andAdminWxNotBetween(String value1, String value2) {
            addCriterion("admin_wx not between", value1, value2, "adminWx");
            return (Criteria) this;
        }

        public Criteria andAdminAddrIsNull() {
            addCriterion("admin_addr is null");
            return (Criteria) this;
        }

        public Criteria andAdminAddrIsNotNull() {
            addCriterion("admin_addr is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAddrEqualTo(String value) {
            addCriterion("admin_addr =", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrNotEqualTo(String value) {
            addCriterion("admin_addr <>", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrGreaterThan(String value) {
            addCriterion("admin_addr >", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrGreaterThanOrEqualTo(String value) {
            addCriterion("admin_addr >=", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrLessThan(String value) {
            addCriterion("admin_addr <", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrLessThanOrEqualTo(String value) {
            addCriterion("admin_addr <=", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrLike(String value) {
            addCriterion("admin_addr like", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrNotLike(String value) {
            addCriterion("admin_addr not like", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrIn(List<String> values) {
            addCriterion("admin_addr in", values, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrNotIn(List<String> values) {
            addCriterion("admin_addr not in", values, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrBetween(String value1, String value2) {
            addCriterion("admin_addr between", value1, value2, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrNotBetween(String value1, String value2) {
            addCriterion("admin_addr not between", value1, value2, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminJobIsNull() {
            addCriterion("admin_job is null");
            return (Criteria) this;
        }

        public Criteria andAdminJobIsNotNull() {
            addCriterion("admin_job is not null");
            return (Criteria) this;
        }

        public Criteria andAdminJobEqualTo(String value) {
            addCriterion("admin_job =", value, "adminJob");
            return (Criteria) this;
        }

        public Criteria andAdminJobNotEqualTo(String value) {
            addCriterion("admin_job <>", value, "adminJob");
            return (Criteria) this;
        }

        public Criteria andAdminJobGreaterThan(String value) {
            addCriterion("admin_job >", value, "adminJob");
            return (Criteria) this;
        }

        public Criteria andAdminJobGreaterThanOrEqualTo(String value) {
            addCriterion("admin_job >=", value, "adminJob");
            return (Criteria) this;
        }

        public Criteria andAdminJobLessThan(String value) {
            addCriterion("admin_job <", value, "adminJob");
            return (Criteria) this;
        }

        public Criteria andAdminJobLessThanOrEqualTo(String value) {
            addCriterion("admin_job <=", value, "adminJob");
            return (Criteria) this;
        }

        public Criteria andAdminJobLike(String value) {
            addCriterion("admin_job like", value, "adminJob");
            return (Criteria) this;
        }

        public Criteria andAdminJobNotLike(String value) {
            addCriterion("admin_job not like", value, "adminJob");
            return (Criteria) this;
        }

        public Criteria andAdminJobIn(List<String> values) {
            addCriterion("admin_job in", values, "adminJob");
            return (Criteria) this;
        }

        public Criteria andAdminJobNotIn(List<String> values) {
            addCriterion("admin_job not in", values, "adminJob");
            return (Criteria) this;
        }

        public Criteria andAdminJobBetween(String value1, String value2) {
            addCriterion("admin_job between", value1, value2, "adminJob");
            return (Criteria) this;
        }

        public Criteria andAdminJobNotBetween(String value1, String value2) {
            addCriterion("admin_job not between", value1, value2, "adminJob");
            return (Criteria) this;
        }

        public Criteria andAdminCardidIsNull() {
            addCriterion("admin_cardId is null");
            return (Criteria) this;
        }

        public Criteria andAdminCardidIsNotNull() {
            addCriterion("admin_cardId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCardidEqualTo(String value) {
            addCriterion("admin_cardId =", value, "adminCardid");
            return (Criteria) this;
        }

        public Criteria andAdminCardidNotEqualTo(String value) {
            addCriterion("admin_cardId <>", value, "adminCardid");
            return (Criteria) this;
        }

        public Criteria andAdminCardidGreaterThan(String value) {
            addCriterion("admin_cardId >", value, "adminCardid");
            return (Criteria) this;
        }

        public Criteria andAdminCardidGreaterThanOrEqualTo(String value) {
            addCriterion("admin_cardId >=", value, "adminCardid");
            return (Criteria) this;
        }

        public Criteria andAdminCardidLessThan(String value) {
            addCriterion("admin_cardId <", value, "adminCardid");
            return (Criteria) this;
        }

        public Criteria andAdminCardidLessThanOrEqualTo(String value) {
            addCriterion("admin_cardId <=", value, "adminCardid");
            return (Criteria) this;
        }

        public Criteria andAdminCardidLike(String value) {
            addCriterion("admin_cardId like", value, "adminCardid");
            return (Criteria) this;
        }

        public Criteria andAdminCardidNotLike(String value) {
            addCriterion("admin_cardId not like", value, "adminCardid");
            return (Criteria) this;
        }

        public Criteria andAdminCardidIn(List<String> values) {
            addCriterion("admin_cardId in", values, "adminCardid");
            return (Criteria) this;
        }

        public Criteria andAdminCardidNotIn(List<String> values) {
            addCriterion("admin_cardId not in", values, "adminCardid");
            return (Criteria) this;
        }

        public Criteria andAdminCardidBetween(String value1, String value2) {
            addCriterion("admin_cardId between", value1, value2, "adminCardid");
            return (Criteria) this;
        }

        public Criteria andAdminCardidNotBetween(String value1, String value2) {
            addCriterion("admin_cardId not between", value1, value2, "adminCardid");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoIsNull() {
            addCriterion("admin_photo is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoIsNotNull() {
            addCriterion("admin_photo is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoEqualTo(String value) {
            addCriterion("admin_photo =", value, "adminPhoto");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoNotEqualTo(String value) {
            addCriterion("admin_photo <>", value, "adminPhoto");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoGreaterThan(String value) {
            addCriterion("admin_photo >", value, "adminPhoto");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("admin_photo >=", value, "adminPhoto");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoLessThan(String value) {
            addCriterion("admin_photo <", value, "adminPhoto");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoLessThanOrEqualTo(String value) {
            addCriterion("admin_photo <=", value, "adminPhoto");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoLike(String value) {
            addCriterion("admin_photo like", value, "adminPhoto");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoNotLike(String value) {
            addCriterion("admin_photo not like", value, "adminPhoto");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoIn(List<String> values) {
            addCriterion("admin_photo in", values, "adminPhoto");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoNotIn(List<String> values) {
            addCriterion("admin_photo not in", values, "adminPhoto");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoBetween(String value1, String value2) {
            addCriterion("admin_photo between", value1, value2, "adminPhoto");
            return (Criteria) this;
        }

        public Criteria andAdminPhotoNotBetween(String value1, String value2) {
            addCriterion("admin_photo not between", value1, value2, "adminPhoto");
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