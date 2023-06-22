package com.Demoforconfiguration.configurationexample1;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my")
public class UserConfig {
private Integer greeting;

public Integer getGreeting() {
	return greeting;
}

public void setGreeting(Integer greeting) {
	this.greeting = greeting;
}

private List<String> names;

public List<String> getNames() {
	return names;
}

public void setNames(List<String> names) {
	this.names = names;
}

}
