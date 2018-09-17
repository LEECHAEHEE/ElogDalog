package com.edlog.boot.springboot.service;

import java.util.List;
import java.util.Map;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;

public interface QueryService {
	
	public QueryBuilder formFilter(String serviceName, String startDate, String endDate);
	public QueryBuilder getMBoolQuery(QueryBuilder queryBuilder);
	public QueryBuilder getMnBoolQuery(QueryBuilder queryBuilder);
	public QueryBuilder getMMBoolQuery(QueryBuilder queryBuilder1, QueryBuilder queryBuilder2);
	public QueryBuilder getMMnBoolQuery(QueryBuilder queryBuilder1, QueryBuilder queryBuilder2);
	public QueryBuilder getSBoolQuery(QueryBuilder queryBuilder);
	public QueryBuilder getSSBoolQuery(QueryBuilder queryBuilder1, QueryBuilder queryBuilder2);
	public QueryBuilder getDateRange(String startDate, String endDate);
	public QueryBuilder getTermQuery(String fieldName, String value);
	public TermsAggregationBuilder getTermsAggregation(String aggsName, String fieldName);
	public SearchResponse getSearchResponse(QueryBuilder query);
	public SearchResponse getSearchResponseWithAggs(AggregationBuilder aggs);
	public SearchResponse getSearchResponseIncludeAggs(QueryBuilder query, AggregationBuilder aggs);
	public List<Map<String, Object>> getResponseAsList(SearchResponse sr);
	public Map<String, List<String>> getBucketAsMap(SearchResponse sr, String aggsName);
	
}