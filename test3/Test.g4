grammar Test;

commentBlock
    : '/*' commentBlockContents '*/'
    | commentBlock NL
    ;

commentBlockContents
    : (.*? (CommentProperty CommentPropertyText)?)
    | commentBlockContents NL commentBlockContents
    ;

CommentProperty
    : ' @' ~[@ \n\r]+? ' '
    ;

CommentPropertyText
    : ~[\n\r]+?
    ;

NL
    : [\n\r]+
    ;