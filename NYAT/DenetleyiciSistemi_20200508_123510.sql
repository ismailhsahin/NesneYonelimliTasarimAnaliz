--
-- PostgreSQL database dump
--

-- Dumped from database version 12.1
-- Dumped by pg_dump version 12rc1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    kullanicino integer NOT NULL,
    kullaniciadi character varying(2044) NOT NULL,
    sifre character varying(2044) NOT NULL
);


ALTER TABLE public.users OWNER TO postgres;

--
-- Name: Users_KullaniciNo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Users_KullaniciNo_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Users_KullaniciNo_seq" OWNER TO postgres;

--
-- Name: Users_KullaniciNo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Users_KullaniciNo_seq" OWNED BY public.users.kullanicino;


--
-- Name: users kullanicino; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users ALTER COLUMN kullanicino SET DEFAULT nextval('public."Users_KullaniciNo_seq"'::regclass);


--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.users VALUES (1, 'ismail', '1');
INSERT INTO public.users VALUES (2, 'hakki', '12');
INSERT INTO public.users VALUES (3, 'sahin', '123');


--
-- Name: Users_KullaniciNo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Users_KullaniciNo_seq"', 1, false);


--
-- Name: users unique_Users_KullaniciAdi; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT "unique_Users_KullaniciAdi" UNIQUE (kullaniciadi);


--
-- Name: users unique_Users_KullaniciNo; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT "unique_Users_KullaniciNo" UNIQUE (kullanicino);


--
-- PostgreSQL database dump complete
--

