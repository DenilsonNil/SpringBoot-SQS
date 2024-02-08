package br.com.kualit.springbootsqs.domain.model;

public record QueueWrapper(String queueUrl, String messageBody) {
}
