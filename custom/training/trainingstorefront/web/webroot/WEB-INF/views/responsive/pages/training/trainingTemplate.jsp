<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<spring:htmlEscape defaultHtmlEscape="true" />

<template:page pageTitle="${pageTitle}">
   <div class="row">
      <div class="col-xs-3">
         <cms:pageSlot position="Section1" var="feature" element="div" class="Section1">
            <cms:component component="${feature}" element="div" class=""/>
         </cms:pageSlot>
      </div>
      <div class="col-sm-12 col-md-9">
         <cms:pageSlot position="Section2" var="feature" element="div" class="Section2">
            <cms:component component="${feature}" element="div" class=""/>
         </cms:pageSlot>
      </div>
      <div class="col-xs-3">
         <cms:pageSlot position="Section3" var="feature" element="div" class="Section3">
            <cms:component component="${feature}" element="div" class=""/>
         </cms:pageSlot>
      </div>
      <div class="col-sm-12 col-md-9">
         <cms:pageSlot position="Section4" var="feature" element="div" class="Section4">
            <cms:component component="${feature}" element="div" class=""/>
         </cms:pageSlot>
      </div>
      <div class="col-xs-3">
         <cms:pageSlot position="Section5" var="feature" element="div" class="Section5">
            <cms:component component="${feature}" element="div" class=""/>
         </cms:pageSlot>
   </div>
</template:page>