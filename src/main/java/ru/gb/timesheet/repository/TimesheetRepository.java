//package ru.gb.timesheet.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import ru.gb.timesheet.model.Timesheet;
//
//import java.time.LocalDate;
//import java.util.List;
//
//public interface TimesheetRepository extends JpaRepository<Timesheet, Long>
//        /* , NamedEntityRepository<Timesheet, Long> */ {
//
//
//
//
//    List<Timesheet> findByCreatedAtBetween(LocalDate min, LocalDate max);
//
//
////    @Query("select t from Timesheet t where t.projectId = :projectId order by t.createdAt desc")
//    List<Timesheet> findByProjectId(Long projectId);
//
//    List<Timesheet> findByEmployeeId(Long employeeId);
//
//
//
//}

package ru.gb.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.timesheet.model.Timesheet;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {


    List<Timesheet> findByProjectId(Long projectId);

    List<Timesheet> findByCreatedAtBeforeAndCreatedAtAfter(LocalDate createdAtBefore, LocalDate createdAtAfter);

    List<Timesheet> findByEmployeeId(Long employeeId);

}



