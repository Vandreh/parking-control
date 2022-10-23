package com.api.parkingcontrol.models;

import javax.persistence.GenerationType;

public @interface GenerateValue {
    GenerationType strategy();
}
