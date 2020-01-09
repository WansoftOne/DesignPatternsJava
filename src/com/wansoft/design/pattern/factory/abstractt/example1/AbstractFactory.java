package com.wansoft.pattern.factory.abstractt.example1;

public interface AbstractFactory<T>{
	T create(String key);
}
