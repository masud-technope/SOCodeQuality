@Override
            public void createSection(Section section) {
            sessionFactory.getCurrentSession().save(section);
            }              

            @Override
          public void deleteSection(Section section) {
             sessionFactory.getCurrentSession().delete(section);

             }

           @Override
           public Section findBySectionID(int id) {
            Query query = sessionFactory.getCurrentSession().createQuery("from Section                   
          where id = " + id);

            return (Section) query.list().get(0);

        }