package com.busanit501.logintest.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QToken is a Querydsl query type for Token
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QToken extends EntityPathBase<Token> {

    private static final long serialVersionUID = -706177755L;

    public static final QToken token = new QToken("token");

    public final StringPath accessToken = createString("accessToken");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath mid = createString("mid");

    public final StringPath refreshToken = createString("refreshToken");

    public QToken(String variable) {
        super(Token.class, forVariable(variable));
    }

    public QToken(Path<? extends Token> path) {
        super(path.getType(), path.getMetadata());
    }

    public QToken(PathMetadata metadata) {
        super(Token.class, metadata);
    }

}

