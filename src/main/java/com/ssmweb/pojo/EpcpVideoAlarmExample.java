package com.ssmweb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EpcpVideoAlarmExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public EpcpVideoAlarmExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNull() {
            addCriterion("ALARM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNotNull() {
            addCriterion("ALARM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeEqualTo(Date value) {
            addCriterion("ALARM_TIME =", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotEqualTo(Date value) {
            addCriterion("ALARM_TIME <>", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThan(Date value) {
            addCriterion("ALARM_TIME >", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ALARM_TIME >=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThan(Date value) {
            addCriterion("ALARM_TIME <", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThanOrEqualTo(Date value) {
            addCriterion("ALARM_TIME <=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIn(List<Date> values) {
            addCriterion("ALARM_TIME in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotIn(List<Date> values) {
            addCriterion("ALARM_TIME not in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeBetween(Date value1, Date value2) {
            addCriterion("ALARM_TIME between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotBetween(Date value1, Date value2) {
            addCriterion("ALARM_TIME not between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNull() {
            addCriterion("ALARM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNotNull() {
            addCriterion("ALARM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeEqualTo(String value) {
            addCriterion("ALARM_TYPE =", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotEqualTo(String value) {
            addCriterion("ALARM_TYPE <>", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThan(String value) {
            addCriterion("ALARM_TYPE >", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ALARM_TYPE >=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThan(String value) {
            addCriterion("ALARM_TYPE <", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThanOrEqualTo(String value) {
            addCriterion("ALARM_TYPE <=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLike(String value) {
            addCriterion("ALARM_TYPE like", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotLike(String value) {
            addCriterion("ALARM_TYPE not like", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIn(List<String> values) {
            addCriterion("ALARM_TYPE in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotIn(List<String> values) {
            addCriterion("ALARM_TYPE not in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeBetween(String value1, String value2) {
            addCriterion("ALARM_TYPE between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotBetween(String value1, String value2) {
            addCriterion("ALARM_TYPE not between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andDeviceIpIsNull() {
            addCriterion("DEVICE_IP is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIpIsNotNull() {
            addCriterion("DEVICE_IP is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIpEqualTo(String value) {
            addCriterion("DEVICE_IP =", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotEqualTo(String value) {
            addCriterion("DEVICE_IP <>", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpGreaterThan(String value) {
            addCriterion("DEVICE_IP >", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_IP >=", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpLessThan(String value) {
            addCriterion("DEVICE_IP <", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_IP <=", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpLike(String value) {
            addCriterion("DEVICE_IP like", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotLike(String value) {
            addCriterion("DEVICE_IP not like", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpIn(List<String> values) {
            addCriterion("DEVICE_IP in", values, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotIn(List<String> values) {
            addCriterion("DEVICE_IP not in", values, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpBetween(String value1, String value2) {
            addCriterion("DEVICE_IP between", value1, value2, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotBetween(String value1, String value2) {
            addCriterion("DEVICE_IP not between", value1, value2, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andChannelNoIsNull() {
            addCriterion("CHANNEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andChannelNoIsNotNull() {
            addCriterion("CHANNEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNoEqualTo(Integer value) {
            addCriterion("CHANNEL_NO =", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotEqualTo(Integer value) {
            addCriterion("CHANNEL_NO <>", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoGreaterThan(Integer value) {
            addCriterion("CHANNEL_NO >", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANNEL_NO >=", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLessThan(Integer value) {
            addCriterion("CHANNEL_NO <", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLessThanOrEqualTo(Integer value) {
            addCriterion("CHANNEL_NO <=", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoIn(List<Integer> values) {
            addCriterion("CHANNEL_NO in", values, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotIn(List<Integer> values) {
            addCriterion("CHANNEL_NO not in", values, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoBetween(Integer value1, Integer value2) {
            addCriterion("CHANNEL_NO between", value1, value2, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANNEL_NO not between", value1, value2, "channelNo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated do_not_delete_during_merge Thu Sep 21 16:31:56 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table epcp_video_alarm
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
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