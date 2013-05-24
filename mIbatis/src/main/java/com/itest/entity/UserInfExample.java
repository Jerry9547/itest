package com.itest.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UserInfExample {

	protected String orderByClause;

    protected List oredCriteria;

    public UserInfExample() {
        oredCriteria = new ArrayList();
    }

    protected UserInfExample(UserInfExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public List getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
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
    }

    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List dateList = new ArrayList();
            Iterator iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(((Date)iter.next()).getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return this;
        }

        public Criteria andUuidEqualTo(Integer value) {
            addCriterion("uuid =", value, "uuid");
            return this;
        }

        public Criteria andUuidNotEqualTo(Integer value) {
            addCriterion("uuid <>", value, "uuid");
            return this;
        }

        public Criteria andUuidGreaterThan(Integer value) {
            addCriterion("uuid >", value, "uuid");
            return this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uuid >=", value, "uuid");
            return this;
        }

        public Criteria andUuidLessThan(Integer value) {
            addCriterion("uuid <", value, "uuid");
            return this;
        }

        public Criteria andUuidLessThanOrEqualTo(Integer value) {
            addCriterion("uuid <=", value, "uuid");
            return this;
        }

        public Criteria andUuidIn(List values) {
            addCriterion("uuid in", values, "uuid");
            return this;
        }

        public Criteria andUuidNotIn(List values) {
            addCriterion("uuid not in", values, "uuid");
            return this;
        }

        public Criteria andUuidBetween(Integer value1, Integer value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return this;
        }

        public Criteria andUuidNotBetween(Integer value1, Integer value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return this;
        }

        public Criteria andAccountIn(List values) {
            addCriterion("account in", values, "account");
            return this;
        }

        public Criteria andAccountNotIn(List values) {
            addCriterion("account not in", values, "account");
            return this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return this;
        }

        public Criteria andPasswordIn(List values) {
            addCriterion("password in", values, "password");
            return this;
        }

        public Criteria andPasswordNotIn(List values) {
            addCriterion("password not in", values, "password");
            return this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return this;
        }

        public Criteria andEmailIn(List values) {
            addCriterion("email in", values, "email");
            return this;
        }

        public Criteria andEmailNotIn(List values) {
            addCriterion("email not in", values, "email");
            return this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return this;
        }

        public Criteria andNicknameIn(List values) {
            addCriterion("nickname in", values, "nickname");
            return this;
        }

        public Criteria andNicknameNotIn(List values) {
            addCriterion("nickname not in", values, "nickname");
            return this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return this;
        }

        public Criteria andProvinceEqualTo(Byte value) {
            addCriterion("province =", value, "province");
            return this;
        }

        public Criteria andProvinceNotEqualTo(Byte value) {
            addCriterion("province <>", value, "province");
            return this;
        }

        public Criteria andProvinceGreaterThan(Byte value) {
            addCriterion("province >", value, "province");
            return this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Byte value) {
            addCriterion("province >=", value, "province");
            return this;
        }

        public Criteria andProvinceLessThan(Byte value) {
            addCriterion("province <", value, "province");
            return this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Byte value) {
            addCriterion("province <=", value, "province");
            return this;
        }

        public Criteria andProvinceIn(List values) {
            addCriterion("province in", values, "province");
            return this;
        }

        public Criteria andProvinceNotIn(List values) {
            addCriterion("province not in", values, "province");
            return this;
        }

        public Criteria andProvinceBetween(Byte value1, Byte value2) {
            addCriterion("province between", value1, value2, "province");
            return this;
        }

        public Criteria andProvinceNotBetween(Byte value1, Byte value2) {
            addCriterion("province not between", value1, value2, "province");
            return this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return this;
        }

        public Criteria andCityEqualTo(Byte value) {
            addCriterion("city =", value, "city");
            return this;
        }

        public Criteria andCityNotEqualTo(Byte value) {
            addCriterion("city <>", value, "city");
            return this;
        }

        public Criteria andCityGreaterThan(Byte value) {
            addCriterion("city >", value, "city");
            return this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Byte value) {
            addCriterion("city >=", value, "city");
            return this;
        }

        public Criteria andCityLessThan(Byte value) {
            addCriterion("city <", value, "city");
            return this;
        }

        public Criteria andCityLessThanOrEqualTo(Byte value) {
            addCriterion("city <=", value, "city");
            return this;
        }

        public Criteria andCityIn(List values) {
            addCriterion("city in", values, "city");
            return this;
        }

        public Criteria andCityNotIn(List values) {
            addCriterion("city not in", values, "city");
            return this;
        }

        public Criteria andCityBetween(Byte value1, Byte value2) {
            addCriterion("city between", value1, value2, "city");
            return this;
        }

        public Criteria andCityNotBetween(Byte value1, Byte value2) {
            addCriterion("city not between", value1, value2, "city");
            return this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return this;
        }

        public Criteria andRegionEqualTo(Byte value) {
            addCriterion("region =", value, "region");
            return this;
        }

        public Criteria andRegionNotEqualTo(Byte value) {
            addCriterion("region <>", value, "region");
            return this;
        }

        public Criteria andRegionGreaterThan(Byte value) {
            addCriterion("region >", value, "region");
            return this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(Byte value) {
            addCriterion("region >=", value, "region");
            return this;
        }

        public Criteria andRegionLessThan(Byte value) {
            addCriterion("region <", value, "region");
            return this;
        }

        public Criteria andRegionLessThanOrEqualTo(Byte value) {
            addCriterion("region <=", value, "region");
            return this;
        }

        public Criteria andRegionIn(List values) {
            addCriterion("region in", values, "region");
            return this;
        }

        public Criteria andRegionNotIn(List values) {
            addCriterion("region not in", values, "region");
            return this;
        }

        public Criteria andRegionBetween(Byte value1, Byte value2) {
            addCriterion("region between", value1, value2, "region");
            return this;
        }

        public Criteria andRegionNotBetween(Byte value1, Byte value2) {
            addCriterion("region not between", value1, value2, "region");
            return this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("sex =", value, "sex");
            return this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("sex <>", value, "sex");
            return this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("sex >", value, "sex");
            return this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("sex >=", value, "sex");
            return this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("sex <", value, "sex");
            return this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("sex <=", value, "sex");
            return this;
        }

        public Criteria andSexIn(List values) {
            addCriterion("sex in", values, "sex");
            return this;
        }

        public Criteria andSexNotIn(List values) {
            addCriterion("sex not in", values, "sex");
            return this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("sex between", value1, value2, "sex");
            return this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return this;
        }

        public Criteria andBirthdayTimeIsNull() {
            addCriterion("birthday_time is null");
            return this;
        }

        public Criteria andBirthdayTimeIsNotNull() {
            addCriterion("birthday_time is not null");
            return this;
        }

        public Criteria andBirthdayTimeEqualTo(Date value) {
            addCriterionForJDBCDate("birthday_time =", value, "birthdayTime");
            return this;
        }

        public Criteria andBirthdayTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday_time <>", value, "birthdayTime");
            return this;
        }

        public Criteria andBirthdayTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday_time >", value, "birthdayTime");
            return this;
        }

        public Criteria andBirthdayTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday_time >=", value, "birthdayTime");
            return this;
        }

        public Criteria andBirthdayTimeLessThan(Date value) {
            addCriterionForJDBCDate("birthday_time <", value, "birthdayTime");
            return this;
        }

        public Criteria andBirthdayTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday_time <=", value, "birthdayTime");
            return this;
        }

        public Criteria andBirthdayTimeIn(List values) {
            addCriterionForJDBCDate("birthday_time in", values, "birthdayTime");
            return this;
        }

        public Criteria andBirthdayTimeNotIn(List values) {
            addCriterionForJDBCDate("birthday_time not in", values, "birthdayTime");
            return this;
        }

        public Criteria andBirthdayTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday_time between", value1, value2, "birthdayTime");
            return this;
        }

        public Criteria andBirthdayTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday_time not between", value1, value2, "birthdayTime");
            return this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return this;
        }

        public Criteria andHeightEqualTo(Byte value) {
            addCriterion("height =", value, "height");
            return this;
        }

        public Criteria andHeightNotEqualTo(Byte value) {
            addCriterion("height <>", value, "height");
            return this;
        }

        public Criteria andHeightGreaterThan(Byte value) {
            addCriterion("height >", value, "height");
            return this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Byte value) {
            addCriterion("height >=", value, "height");
            return this;
        }

        public Criteria andHeightLessThan(Byte value) {
            addCriterion("height <", value, "height");
            return this;
        }

        public Criteria andHeightLessThanOrEqualTo(Byte value) {
            addCriterion("height <=", value, "height");
            return this;
        }

        public Criteria andHeightIn(List values) {
            addCriterion("height in", values, "height");
            return this;
        }

        public Criteria andHeightNotIn(List values) {
            addCriterion("height not in", values, "height");
            return this;
        }

        public Criteria andHeightBetween(Byte value1, Byte value2) {
            addCriterion("height between", value1, value2, "height");
            return this;
        }

        public Criteria andHeightNotBetween(Byte value1, Byte value2) {
            addCriterion("height not between", value1, value2, "height");
            return this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return this;
        }

        public Criteria andWeightEqualTo(Byte value) {
            addCriterion("weight =", value, "weight");
            return this;
        }

        public Criteria andWeightNotEqualTo(Byte value) {
            addCriterion("weight <>", value, "weight");
            return this;
        }

        public Criteria andWeightGreaterThan(Byte value) {
            addCriterion("weight >", value, "weight");
            return this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Byte value) {
            addCriterion("weight >=", value, "weight");
            return this;
        }

        public Criteria andWeightLessThan(Byte value) {
            addCriterion("weight <", value, "weight");
            return this;
        }

        public Criteria andWeightLessThanOrEqualTo(Byte value) {
            addCriterion("weight <=", value, "weight");
            return this;
        }

        public Criteria andWeightIn(List values) {
            addCriterion("weight in", values, "weight");
            return this;
        }

        public Criteria andWeightNotIn(List values) {
            addCriterion("weight not in", values, "weight");
            return this;
        }

        public Criteria andWeightBetween(Byte value1, Byte value2) {
            addCriterion("weight between", value1, value2, "weight");
            return this;
        }

        public Criteria andWeightNotBetween(Byte value1, Byte value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return this;
        }

        public Criteria andSummaryIn(List values) {
            addCriterion("summary in", values, "summary");
            return this;
        }

        public Criteria andSummaryNotIn(List values) {
            addCriterion("summary not in", values, "summary");
            return this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return this;
        }

        public Criteria andProfessionalIsNull() {
            addCriterion("professional is null");
            return this;
        }

        public Criteria andProfessionalIsNotNull() {
            addCriterion("professional is not null");
            return this;
        }

        public Criteria andProfessionalEqualTo(Byte value) {
            addCriterion("professional =", value, "professional");
            return this;
        }

        public Criteria andProfessionalNotEqualTo(Byte value) {
            addCriterion("professional <>", value, "professional");
            return this;
        }

        public Criteria andProfessionalGreaterThan(Byte value) {
            addCriterion("professional >", value, "professional");
            return this;
        }

        public Criteria andProfessionalGreaterThanOrEqualTo(Byte value) {
            addCriterion("professional >=", value, "professional");
            return this;
        }

        public Criteria andProfessionalLessThan(Byte value) {
            addCriterion("professional <", value, "professional");
            return this;
        }

        public Criteria andProfessionalLessThanOrEqualTo(Byte value) {
            addCriterion("professional <=", value, "professional");
            return this;
        }

        public Criteria andProfessionalIn(List values) {
            addCriterion("professional in", values, "professional");
            return this;
        }

        public Criteria andProfessionalNotIn(List values) {
            addCriterion("professional not in", values, "professional");
            return this;
        }

        public Criteria andProfessionalBetween(Byte value1, Byte value2) {
            addCriterion("professional between", value1, value2, "professional");
            return this;
        }

        public Criteria andProfessionalNotBetween(Byte value1, Byte value2) {
            addCriterion("professional not between", value1, value2, "professional");
            return this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return this;
        }

        public Criteria andSalaryEqualTo(Byte value) {
            addCriterion("salary =", value, "salary");
            return this;
        }

        public Criteria andSalaryNotEqualTo(Byte value) {
            addCriterion("salary <>", value, "salary");
            return this;
        }

        public Criteria andSalaryGreaterThan(Byte value) {
            addCriterion("salary >", value, "salary");
            return this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Byte value) {
            addCriterion("salary >=", value, "salary");
            return this;
        }

        public Criteria andSalaryLessThan(Byte value) {
            addCriterion("salary <", value, "salary");
            return this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Byte value) {
            addCriterion("salary <=", value, "salary");
            return this;
        }

        public Criteria andSalaryIn(List values) {
            addCriterion("salary in", values, "salary");
            return this;
        }

        public Criteria andSalaryNotIn(List values) {
            addCriterion("salary not in", values, "salary");
            return this;
        }

        public Criteria andSalaryBetween(Byte value1, Byte value2) {
            addCriterion("salary between", value1, value2, "salary");
            return this;
        }

        public Criteria andSalaryNotBetween(Byte value1, Byte value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return this;
        }

        public Criteria andCompanyIn(List values) {
            addCriterion("company in", values, "company");
            return this;
        }

        public Criteria andCompanyNotIn(List values) {
            addCriterion("company not in", values, "company");
            return this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return this;
        }

        public Criteria andTotalCoinIsNull() {
            addCriterion("total_coin is null");
            return this;
        }

        public Criteria andTotalCoinIsNotNull() {
            addCriterion("total_coin is not null");
            return this;
        }

        public Criteria andTotalCoinEqualTo(Integer value) {
            addCriterion("total_coin =", value, "totalCoin");
            return this;
        }

        public Criteria andTotalCoinNotEqualTo(Integer value) {
            addCriterion("total_coin <>", value, "totalCoin");
            return this;
        }

        public Criteria andTotalCoinGreaterThan(Integer value) {
            addCriterion("total_coin >", value, "totalCoin");
            return this;
        }

        public Criteria andTotalCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_coin >=", value, "totalCoin");
            return this;
        }

        public Criteria andTotalCoinLessThan(Integer value) {
            addCriterion("total_coin <", value, "totalCoin");
            return this;
        }

        public Criteria andTotalCoinLessThanOrEqualTo(Integer value) {
            addCriterion("total_coin <=", value, "totalCoin");
            return this;
        }

        public Criteria andTotalCoinIn(List values) {
            addCriterion("total_coin in", values, "totalCoin");
            return this;
        }

        public Criteria andTotalCoinNotIn(List values) {
            addCriterion("total_coin not in", values, "totalCoin");
            return this;
        }

        public Criteria andTotalCoinBetween(Integer value1, Integer value2) {
            addCriterion("total_coin between", value1, value2, "totalCoin");
            return this;
        }

        public Criteria andTotalCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("total_coin not between", value1, value2, "totalCoin");
            return this;
        }

        public Criteria andFreezeCoinIsNull() {
            addCriterion("freeze_coin is null");
            return this;
        }

        public Criteria andFreezeCoinIsNotNull() {
            addCriterion("freeze_coin is not null");
            return this;
        }

        public Criteria andFreezeCoinEqualTo(Integer value) {
            addCriterion("freeze_coin =", value, "freezeCoin");
            return this;
        }

        public Criteria andFreezeCoinNotEqualTo(Integer value) {
            addCriterion("freeze_coin <>", value, "freezeCoin");
            return this;
        }

        public Criteria andFreezeCoinGreaterThan(Integer value) {
            addCriterion("freeze_coin >", value, "freezeCoin");
            return this;
        }

        public Criteria andFreezeCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeze_coin >=", value, "freezeCoin");
            return this;
        }

        public Criteria andFreezeCoinLessThan(Integer value) {
            addCriterion("freeze_coin <", value, "freezeCoin");
            return this;
        }

        public Criteria andFreezeCoinLessThanOrEqualTo(Integer value) {
            addCriterion("freeze_coin <=", value, "freezeCoin");
            return this;
        }

        public Criteria andFreezeCoinIn(List values) {
            addCriterion("freeze_coin in", values, "freezeCoin");
            return this;
        }

        public Criteria andFreezeCoinNotIn(List values) {
            addCriterion("freeze_coin not in", values, "freezeCoin");
            return this;
        }

        public Criteria andFreezeCoinBetween(Integer value1, Integer value2) {
            addCriterion("freeze_coin between", value1, value2, "freezeCoin");
            return this;
        }

        public Criteria andFreezeCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("freeze_coin not between", value1, value2, "freezeCoin");
            return this;
        }

        public Criteria andPosiLongitudeIsNull() {
            addCriterion("posi_longitude is null");
            return this;
        }

        public Criteria andPosiLongitudeIsNotNull() {
            addCriterion("posi_longitude is not null");
            return this;
        }

        public Criteria andPosiLongitudeEqualTo(Double value) {
            addCriterion("posi_longitude =", value, "posiLongitude");
            return this;
        }

        public Criteria andPosiLongitudeNotEqualTo(Double value) {
            addCriterion("posi_longitude <>", value, "posiLongitude");
            return this;
        }

        public Criteria andPosiLongitudeGreaterThan(Double value) {
            addCriterion("posi_longitude >", value, "posiLongitude");
            return this;
        }

        public Criteria andPosiLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("posi_longitude >=", value, "posiLongitude");
            return this;
        }

        public Criteria andPosiLongitudeLessThan(Double value) {
            addCriterion("posi_longitude <", value, "posiLongitude");
            return this;
        }

        public Criteria andPosiLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("posi_longitude <=", value, "posiLongitude");
            return this;
        }

        public Criteria andPosiLongitudeIn(List values) {
            addCriterion("posi_longitude in", values, "posiLongitude");
            return this;
        }

        public Criteria andPosiLongitudeNotIn(List values) {
            addCriterion("posi_longitude not in", values, "posiLongitude");
            return this;
        }

        public Criteria andPosiLongitudeBetween(Double value1, Double value2) {
            addCriterion("posi_longitude between", value1, value2, "posiLongitude");
            return this;
        }

        public Criteria andPosiLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("posi_longitude not between", value1, value2, "posiLongitude");
            return this;
        }

        public Criteria andPosiLatitudeIsNull() {
            addCriterion("posi_latitude is null");
            return this;
        }

        public Criteria andPosiLatitudeIsNotNull() {
            addCriterion("posi_latitude is not null");
            return this;
        }

        public Criteria andPosiLatitudeEqualTo(Double value) {
            addCriterion("posi_latitude =", value, "posiLatitude");
            return this;
        }

        public Criteria andPosiLatitudeNotEqualTo(Double value) {
            addCriterion("posi_latitude <>", value, "posiLatitude");
            return this;
        }

        public Criteria andPosiLatitudeGreaterThan(Double value) {
            addCriterion("posi_latitude >", value, "posiLatitude");
            return this;
        }

        public Criteria andPosiLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("posi_latitude >=", value, "posiLatitude");
            return this;
        }

        public Criteria andPosiLatitudeLessThan(Double value) {
            addCriterion("posi_latitude <", value, "posiLatitude");
            return this;
        }

        public Criteria andPosiLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("posi_latitude <=", value, "posiLatitude");
            return this;
        }

        public Criteria andPosiLatitudeIn(List values) {
            addCriterion("posi_latitude in", values, "posiLatitude");
            return this;
        }

        public Criteria andPosiLatitudeNotIn(List values) {
            addCriterion("posi_latitude not in", values, "posiLatitude");
            return this;
        }

        public Criteria andPosiLatitudeBetween(Double value1, Double value2) {
            addCriterion("posi_latitude between", value1, value2, "posiLatitude");
            return this;
        }

        public Criteria andPosiLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("posi_latitude not between", value1, value2, "posiLatitude");
            return this;
        }

        public Criteria andPosiHeightIsNull() {
            addCriterion("posi_height is null");
            return this;
        }

        public Criteria andPosiHeightIsNotNull() {
            addCriterion("posi_height is not null");
            return this;
        }

        public Criteria andPosiHeightEqualTo(Integer value) {
            addCriterion("posi_height =", value, "posiHeight");
            return this;
        }

        public Criteria andPosiHeightNotEqualTo(Integer value) {
            addCriterion("posi_height <>", value, "posiHeight");
            return this;
        }

        public Criteria andPosiHeightGreaterThan(Integer value) {
            addCriterion("posi_height >", value, "posiHeight");
            return this;
        }

        public Criteria andPosiHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("posi_height >=", value, "posiHeight");
            return this;
        }

        public Criteria andPosiHeightLessThan(Integer value) {
            addCriterion("posi_height <", value, "posiHeight");
            return this;
        }

        public Criteria andPosiHeightLessThanOrEqualTo(Integer value) {
            addCriterion("posi_height <=", value, "posiHeight");
            return this;
        }

        public Criteria andPosiHeightIn(List values) {
            addCriterion("posi_height in", values, "posiHeight");
            return this;
        }

        public Criteria andPosiHeightNotIn(List values) {
            addCriterion("posi_height not in", values, "posiHeight");
            return this;
        }

        public Criteria andPosiHeightBetween(Integer value1, Integer value2) {
            addCriterion("posi_height between", value1, value2, "posiHeight");
            return this;
        }

        public Criteria andPosiHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("posi_height not between", value1, value2, "posiHeight");
            return this;
        }

        public Criteria andOnlineStatusIsNull() {
            addCriterion("online_status is null");
            return this;
        }

        public Criteria andOnlineStatusIsNotNull() {
            addCriterion("online_status is not null");
            return this;
        }

        public Criteria andOnlineStatusEqualTo(Byte value) {
            addCriterion("online_status =", value, "onlineStatus");
            return this;
        }

        public Criteria andOnlineStatusNotEqualTo(Byte value) {
            addCriterion("online_status <>", value, "onlineStatus");
            return this;
        }

        public Criteria andOnlineStatusGreaterThan(Byte value) {
            addCriterion("online_status >", value, "onlineStatus");
            return this;
        }

        public Criteria andOnlineStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("online_status >=", value, "onlineStatus");
            return this;
        }

        public Criteria andOnlineStatusLessThan(Byte value) {
            addCriterion("online_status <", value, "onlineStatus");
            return this;
        }

        public Criteria andOnlineStatusLessThanOrEqualTo(Byte value) {
            addCriterion("online_status <=", value, "onlineStatus");
            return this;
        }

        public Criteria andOnlineStatusIn(List values) {
            addCriterion("online_status in", values, "onlineStatus");
            return this;
        }

        public Criteria andOnlineStatusNotIn(List values) {
            addCriterion("online_status not in", values, "onlineStatus");
            return this;
        }

        public Criteria andOnlineStatusBetween(Byte value1, Byte value2) {
            addCriterion("online_status between", value1, value2, "onlineStatus");
            return this;
        }

        public Criteria andOnlineStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("online_status not between", value1, value2, "onlineStatus");
            return this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeIn(List values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeNotIn(List values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("session_id =", value, "sessionId");
            return this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("session_id <>", value, "sessionId");
            return this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("session_id >", value, "sessionId");
            return this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("session_id >=", value, "sessionId");
            return this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("session_id <", value, "sessionId");
            return this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("session_id <=", value, "sessionId");
            return this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("session_id like", value, "sessionId");
            return this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("session_id not like", value, "sessionId");
            return this;
        }

        public Criteria andSessionIdIn(List values) {
            addCriterion("session_id in", values, "sessionId");
            return this;
        }

        public Criteria andSessionIdNotIn(List values) {
            addCriterion("session_id not in", values, "sessionId");
            return this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return this;
        }

        public Criteria andLoginSourceIsNull() {
            addCriterion("login_source is null");
            return this;
        }

        public Criteria andLoginSourceIsNotNull() {
            addCriterion("login_source is not null");
            return this;
        }

        public Criteria andLoginSourceEqualTo(Byte value) {
            addCriterion("login_source =", value, "loginSource");
            return this;
        }

        public Criteria andLoginSourceNotEqualTo(Byte value) {
            addCriterion("login_source <>", value, "loginSource");
            return this;
        }

        public Criteria andLoginSourceGreaterThan(Byte value) {
            addCriterion("login_source >", value, "loginSource");
            return this;
        }

        public Criteria andLoginSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("login_source >=", value, "loginSource");
            return this;
        }

        public Criteria andLoginSourceLessThan(Byte value) {
            addCriterion("login_source <", value, "loginSource");
            return this;
        }

        public Criteria andLoginSourceLessThanOrEqualTo(Byte value) {
            addCriterion("login_source <=", value, "loginSource");
            return this;
        }

        public Criteria andLoginSourceIn(List values) {
            addCriterion("login_source in", values, "loginSource");
            return this;
        }

        public Criteria andLoginSourceNotIn(List values) {
            addCriterion("login_source not in", values, "loginSource");
            return this;
        }

        public Criteria andLoginSourceBetween(Byte value1, Byte value2) {
            addCriterion("login_source between", value1, value2, "loginSource");
            return this;
        }

        public Criteria andLoginSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("login_source not between", value1, value2, "loginSource");
            return this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List values) {
            addCriterion("create_time in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List values) {
            addCriterion("create_time not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return this;
        }

        public Criteria andPosiStatusIsNull() {
            addCriterion("posi_status is null");
            return this;
        }

        public Criteria andPosiStatusIsNotNull() {
            addCriterion("posi_status is not null");
            return this;
        }

        public Criteria andPosiStatusEqualTo(Boolean value) {
            addCriterion("posi_status =", value, "posiStatus");
            return this;
        }

        public Criteria andPosiStatusNotEqualTo(Boolean value) {
            addCriterion("posi_status <>", value, "posiStatus");
            return this;
        }

        public Criteria andPosiStatusGreaterThan(Boolean value) {
            addCriterion("posi_status >", value, "posiStatus");
            return this;
        }

        public Criteria andPosiStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("posi_status >=", value, "posiStatus");
            return this;
        }

        public Criteria andPosiStatusLessThan(Boolean value) {
            addCriterion("posi_status <", value, "posiStatus");
            return this;
        }

        public Criteria andPosiStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("posi_status <=", value, "posiStatus");
            return this;
        }

        public Criteria andPosiStatusIn(List values) {
            addCriterion("posi_status in", values, "posiStatus");
            return this;
        }

        public Criteria andPosiStatusNotIn(List values) {
            addCriterion("posi_status not in", values, "posiStatus");
            return this;
        }

        public Criteria andPosiStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("posi_status between", value1, value2, "posiStatus");
            return this;
        }

        public Criteria andPosiStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("posi_status not between", value1, value2, "posiStatus");
            return this;
        }

        public Criteria andDataFullIsNull() {
            addCriterion("data_full is null");
            return this;
        }

        public Criteria andDataFullIsNotNull() {
            addCriterion("data_full is not null");
            return this;
        }

        public Criteria andDataFullEqualTo(Boolean value) {
            addCriterion("data_full =", value, "dataFull");
            return this;
        }

        public Criteria andDataFullNotEqualTo(Boolean value) {
            addCriterion("data_full <>", value, "dataFull");
            return this;
        }

        public Criteria andDataFullGreaterThan(Boolean value) {
            addCriterion("data_full >", value, "dataFull");
            return this;
        }

        public Criteria andDataFullGreaterThanOrEqualTo(Boolean value) {
            addCriterion("data_full >=", value, "dataFull");
            return this;
        }

        public Criteria andDataFullLessThan(Boolean value) {
            addCriterion("data_full <", value, "dataFull");
            return this;
        }

        public Criteria andDataFullLessThanOrEqualTo(Boolean value) {
            addCriterion("data_full <=", value, "dataFull");
            return this;
        }

        public Criteria andDataFullIn(List values) {
            addCriterion("data_full in", values, "dataFull");
            return this;
        }

        public Criteria andDataFullNotIn(List values) {
            addCriterion("data_full not in", values, "dataFull");
            return this;
        }

        public Criteria andDataFullBetween(Boolean value1, Boolean value2) {
            addCriterion("data_full between", value1, value2, "dataFull");
            return this;
        }

        public Criteria andDataFullNotBetween(Boolean value1, Boolean value2) {
            addCriterion("data_full not between", value1, value2, "dataFull");
            return this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return this;
        }

        public Criteria andStatusIn(List values) {
            addCriterion("status in", values, "status");
            return this;
        }

        public Criteria andStatusNotIn(List values) {
            addCriterion("status not in", values, "status");
            return this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return this;
        }
    }
}