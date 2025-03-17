package com.devtiro.database.mappers;

import com.devtiro.database.domain.dto.AuthorDto;

public interface Mapper<A,B> {

    B mapTo(A a);

    A mapFrom(B b);

}


