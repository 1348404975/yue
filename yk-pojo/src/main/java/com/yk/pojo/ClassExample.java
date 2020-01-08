package com.yk.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClassExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLbIsNull() {
            addCriterion("lb is null");
            return (Criteria) this;
        }

        public Criteria andLbIsNotNull() {
            addCriterion("lb is not null");
            return (Criteria) this;
        }

        public Criteria andLbEqualTo(String value) {
            addCriterion("lb =", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotEqualTo(String value) {
            addCriterion("lb <>", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbGreaterThan(String value) {
            addCriterion("lb >", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbGreaterThanOrEqualTo(String value) {
            addCriterion("lb >=", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLessThan(String value) {
            addCriterion("lb <", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLessThanOrEqualTo(String value) {
            addCriterion("lb <=", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLike(String value) {
            addCriterion("lb like", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotLike(String value) {
            addCriterion("lb not like", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbIn(List<String> values) {
            addCriterion("lb in", values, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotIn(List<String> values) {
            addCriterion("lb not in", values, "lb");
            return (Criteria) this;
        }

        public Criteria andLbBetween(String value1, String value2) {
            addCriterion("lb between", value1, value2, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotBetween(String value1, String value2) {
            addCriterion("lb not between", value1, value2, "lb");
            return (Criteria) this;
        }

        public Criteria andKsIsNull() {
            addCriterion("ks is null");
            return (Criteria) this;
        }

        public Criteria andKsIsNotNull() {
            addCriterion("ks is not null");
            return (Criteria) this;
        }

        public Criteria andKsEqualTo(String value) {
            addCriterion("ks =", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotEqualTo(String value) {
            addCriterion("ks <>", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsGreaterThan(String value) {
            addCriterion("ks >", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsGreaterThanOrEqualTo(String value) {
            addCriterion("ks >=", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsLessThan(String value) {
            addCriterion("ks <", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsLessThanOrEqualTo(String value) {
            addCriterion("ks <=", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsLike(String value) {
            addCriterion("ks like", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotLike(String value) {
            addCriterion("ks not like", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsIn(List<String> values) {
            addCriterion("ks in", values, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotIn(List<String> values) {
            addCriterion("ks not in", values, "ks");
            return (Criteria) this;
        }

        public Criteria andKsBetween(String value1, String value2) {
            addCriterion("ks between", value1, value2, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotBetween(String value1, String value2) {
            addCriterion("ks not between", value1, value2, "ks");
            return (Criteria) this;
        }

        public Criteria andLsIsNull() {
            addCriterion("ls is null");
            return (Criteria) this;
        }

        public Criteria andLsIsNotNull() {
            addCriterion("ls is not null");
            return (Criteria) this;
        }

        public Criteria andLsEqualTo(String value) {
            addCriterion("ls =", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsNotEqualTo(String value) {
            addCriterion("ls <>", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsGreaterThan(String value) {
            addCriterion("ls >", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsGreaterThanOrEqualTo(String value) {
            addCriterion("ls >=", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsLessThan(String value) {
            addCriterion("ls <", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsLessThanOrEqualTo(String value) {
            addCriterion("ls <=", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsLike(String value) {
            addCriterion("ls like", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsNotLike(String value) {
            addCriterion("ls not like", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsIn(List<String> values) {
            addCriterion("ls in", values, "ls");
            return (Criteria) this;
        }

        public Criteria andLsNotIn(List<String> values) {
            addCriterion("ls not in", values, "ls");
            return (Criteria) this;
        }

        public Criteria andLsBetween(String value1, String value2) {
            addCriterion("ls between", value1, value2, "ls");
            return (Criteria) this;
        }

        public Criteria andLsNotBetween(String value1, String value2) {
            addCriterion("ls not between", value1, value2, "ls");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andFalgIsNull() {
            addCriterion("falg is null");
            return (Criteria) this;
        }

        public Criteria andFalgIsNotNull() {
            addCriterion("falg is not null");
            return (Criteria) this;
        }

        public Criteria andFalgEqualTo(String value) {
            addCriterion("falg =", value, "falg");
            return (Criteria) this;
        }

        public Criteria andFalgNotEqualTo(String value) {
            addCriterion("falg <>", value, "falg");
            return (Criteria) this;
        }

        public Criteria andFalgGreaterThan(String value) {
            addCriterion("falg >", value, "falg");
            return (Criteria) this;
        }

        public Criteria andFalgGreaterThanOrEqualTo(String value) {
            addCriterion("falg >=", value, "falg");
            return (Criteria) this;
        }

        public Criteria andFalgLessThan(String value) {
            addCriterion("falg <", value, "falg");
            return (Criteria) this;
        }

        public Criteria andFalgLessThanOrEqualTo(String value) {
            addCriterion("falg <=", value, "falg");
            return (Criteria) this;
        }

        public Criteria andFalgLike(String value) {
            addCriterion("falg like", value, "falg");
            return (Criteria) this;
        }

        public Criteria andFalgNotLike(String value) {
            addCriterion("falg not like", value, "falg");
            return (Criteria) this;
        }

        public Criteria andFalgIn(List<String> values) {
            addCriterion("falg in", values, "falg");
            return (Criteria) this;
        }

        public Criteria andFalgNotIn(List<String> values) {
            addCriterion("falg not in", values, "falg");
            return (Criteria) this;
        }

        public Criteria andFalgBetween(String value1, String value2) {
            addCriterion("falg between", value1, value2, "falg");
            return (Criteria) this;
        }

        public Criteria andFalgNotBetween(String value1, String value2) {
            addCriterion("falg not between", value1, value2, "falg");
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