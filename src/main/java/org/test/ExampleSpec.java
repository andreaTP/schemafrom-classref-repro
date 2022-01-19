package org.test;

import io.fabric8.crd.generator.annotation.SchemaFrom;

public class ExampleSpec {
  @SchemaFrom(type = ExampleStatus.class)
  int someValue;
}
