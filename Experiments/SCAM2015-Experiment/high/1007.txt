create table blobtest (
id number primary key,
myblob blob);

create sequence blobseq start with 1 increment by 1;

CREATE OR REPLACE TRIGGER blob_trigger
BEFORE INSERT
ON blobtest
REFERENCING NEW AS NEW
FOR EACH ROW
BEGIN
SELECT blobseq.nextval INTO :NEW.ID FROM dual;
end;
/