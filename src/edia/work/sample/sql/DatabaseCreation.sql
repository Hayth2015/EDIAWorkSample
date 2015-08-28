
/*Create table TextContent*/

CREATE TABLE textcontent
(
  idtextcontent integer NOT NULL,
  newtext character varying(255),
  datecreation date,
  oldtext character varying(255),
  datemodification date,
  title character varying(40),
  CONSTRAINT textcontent_pkey PRIMARY KEY (idtextcontent)
)

/*Create sequences for id auto increment*/

CREATE SEQUENCE public.textcontent_seq
   INCREMENT 1
   START 4;
ALTER SEQUENCE public.textcontent_seq
  OWNER TO postgres;
  
/*Create population examples*/

INSERT INTO textcontent(
            idtextcontent, newtext, datecreation, oldtext, datemodification, title)
    VALUES (1,'Work Sample 1','2015-08-27',null,null,'Text1');
    
    INSERT INTO textcontent(
            idtextcontent, newtext, datecreation, oldtext, datemodification, title)
    VALUES (2,'Work Sample 2','2015-08-27',null,null,'Text 2');
    
    INSERT INTO textcontent(
            idtextcontent, newtext, datecreation, oldtext, datemodification, title)
    VALUES (3,'Work Sample 4','2015-08-27','Work Sample 3','2015-08-27','Text 3');
    
