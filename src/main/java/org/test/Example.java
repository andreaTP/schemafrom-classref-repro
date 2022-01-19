package org.test;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;
import io.fabric8.kubernetes.model.annotation.Plural;

@Group("org.example")
@Version("v1alpha1")
@ShortNames("ex")
@Plural("examples")
public class Example extends CustomResource<ExampleSpec, ExampleStatus> implements Namespaced {}
