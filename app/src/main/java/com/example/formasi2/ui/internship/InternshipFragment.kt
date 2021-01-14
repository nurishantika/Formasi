package com.example.formasi2.ui.internship

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.formasi2.R

class InternshipFragment : Fragment() {

    private lateinit var InternshipDataViewModel: InternshipViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.internship_fragment, container, false)
        val testData = createInternshipData()
        root.findViewById<RecyclerView>(R.id.internshiprv).layoutManager = LinearLayoutManager(context)
        root.findViewById<RecyclerView>(R.id.internshiprv).setHasFixedSize(true)
        root.findViewById<RecyclerView>(R.id.internshiprv).adapter = InternshipAdapter(testData, {
            InternshipItem: InternshipData -> internshipItemClicked(InternshipItem)})
        return root
    }

    private fun internshipItemClicked(InternshipData: InternshipData) {
        val showDetailActivity = Intent(context, InternshipDetailActivity::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, InternshipData.InternshipPhoto.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME, InternshipData.InternshipNama)
        showDetailActivity.putExtra(Intent.EXTRA_TITLE, InternshipData.InternshipJob)
        showDetailActivity.putExtra(Intent.EXTRA_INSTALLER_PACKAGE_NAME, InternshipData.InternshipDate)
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS, InternshipData.InternshipDeskripsi)
        showDetailActivity.putExtra(Intent.EXTRA_REFERRER_NAME, InternshipData.InternshipLink)
        startActivity(showDetailActivity)
    }

    private fun createInternshipData() : List<InternshipData> {
        val partList = ArrayList<InternshipData>()
        partList.add(InternshipData(
                R.drawable.intern3,
                "Kata Kecil Kana",
                "Program Officer, Social Media Manager, Graphic Designer",
                "Deadline 10 Januari 2021",
                "Persyaratan Umum:\n" +
                        "• Usia minimal 19 tahun\n" +
                        "• Memiliki ketertarikan pada isu sosial emosial dan literasi anak\n" +
                        "• Mahir menggunakan platform digital seperti Zoom, Google Drive, dan sejenisnya",
                "https://docs.google.com/forms/d/e/1FAIpQLSd3JmG-KcWwRqE3VrMAFdKtzP3BQbfxamWMco5gqszP6whwZQ/viewform"
        ))
        partList.add(InternshipData(
                R.drawable.intern4,
                "Inagi Open Internship 5.0",
                "Social Media Content Creator, Graphic Designer, Videographer & Video Editor",
                "Deadline 10 Januari 2021",
                "INAGI merupakan startup company yang bergerak di bidang manufaktur mesin-mesin inovatif dalam bidang agrokompleks. INAGI telah berekspansi dengan banyak inovasi mesin dan produk yang berteknologi tinggi dan terstandarisasi. Kali ini @inagiofficial kembali membuka program INTERNSHIP yang sayang banget kalau kamu lewatkan !\n" +
                        "\n" +
                        "Kesempatan spesial ini cocok banget buat kamu, yang lagi :\n" +
                        "\n" +
                        "1. Periode Praktik Kerja Lapang (PKL) alias magang\n" +
                        "\n" +
                        "2. Semester akhir yang hanya tinggal skripsi\n" +
                        "\n" +
                        "3. Challenge and experience seeker\n" +
                        "\n" +
                        "dan tentunya kamu yang gabut selama #dirumahaja ! Mending waktunya dimanfaatkan bersama INAGI ! Selain dapet pengalaman, kamu juga akan dilatih dan dibimbing secara professional dengan segudang ilmu yang bermanfaat ! Oleh sebab itu, kamu gak perlu takut mengenai perbedaan jurusan sebab selama kamu punya passion dan kemauan belajar, maka KAMULAH YANG KAMI CARI !",
                "https://www.instagram.com/p/CI4nyfcgVuQ/"
        ))
        partList.add(InternshipData(
                R.drawable.intern1,
            "Fopini.id",
                "Content Writer & Graphic Designer",
            "Deadline 14 Januari 2021",
            "Requirement\n" +
                    "• Mahasiswa/i aktif atau Freshgraduate diperbolehkan mendaftar\n" +
                    "• Loyal dan berkomitmen menjalankan tugas selama menjadi staf Fopini.id\n" +
                    "• Bisa menulis sesuai kaidah jurnalistik dasar (content writer intern)\n" +
                    "• Mahir desain dan editing (graphic designer intern)",
            "https://www.instagram.com/p/CJk1CdVsiZH/"
        ))
        partList.add(InternshipData(
                R.drawable.intern5,
                "Muamalat Institute",
                "Client Relationship Manager",
                "Deadline 15 Januari 2021",
                "Kualifikasi :\n" +
                        "Pria atau Wanita\n" +
                        "Usia 20 – 27 tahun\n" +
                        "Pendidikan min. D3 atau S1\n" +
                        "Fresh graduate atau mahasiswa tingkat akhir\n" +
                        "Memiliki banyak relasi dan jaringan\n" +
                        "\n" +
                        "Keahlian :\n" +
                        "Mempunyai kemampuan komunikasi yang baik\n" +
                        "Berpengalaman di bidang marketing atau sales\n" +
                        "Berorientasi pada target",
                "https://www.instagram.com/p/CJLe0v5sa4U/"
        ))
        partList.add(InternshipData(
                R.drawable.intern7,
        "Muamalat Institute",
                "Desain Grafis & Video Maker",
        "Deadline 15 Januari 2021",
        "Kualifikasi :\n" +
                "Pria atau Wanita\n" +
                "Usia 20 – 27 tahun\n" +
                "Pendidikan min. D3 atau S1\n" +
                "Fresh graduate atau mahasiswa tingkat akhir\n" +
                "Memiliki banyak relasi dan jaringan\n" +
                "\n" +
                "Keahlian :\n" +
                "- Menguasai Adobe Photoshop, CorelDraw, Adobe Illustrator & Adobe Premier\n" +
                "- Memiliki passion di dunia desain grafis\n" +
                "- Memiliki kemampuan layout desain\n" +
                "- Memiliki pengalaman dalam membuat video untuk youtube\n" +
                "- Berorientasi pada target",
        "https://www.instagram.com/p/CJNxImMMZOB/"
        ))
        partList.add(InternshipData(
                R.drawable.intern8,
        "Muamalat Institute",
                "Product Development",
        "Deadline 15 Januari 2021",
        "Kualifikasi :\n" +
                "Pria atau Wanita\n" +
                "Usia 20 – 27 tahun\n" +
                "Pendidikan min. D3 atau S1\n" +
                "Fresh graduate atau mahasiswa tingkat akhir\n" +
                "Memiliki banyak relasi dan jaringan\n" +
                "\n" +
                "Keahlian :\n" +
                "- memahani perbankan syariah/ekonomi syariah\n" +
                "- memiliki analisis dan report yang baik\n" +
                "- berpengalaman di bisang riset/penelitian, olah data dan konsultasi\n" +
                "- berorientasi pada target",
        "https://www.instagram.com/p/CJQFVLSsOtC/"
        ))
        partList.add(InternshipData(
                R.drawable.intern9,
        "Muamalat Institute",
                "Digital Marketing",
        "Deadline 15 Januari 2021",
        "Kualifikasi :\n" +
                "Pria atau Wanita\n" +
                "Usia 20 – 27 tahun\n" +
                "Pendidikan min. D3 atau S1\n" +
                "Fresh graduate atau mahasiswa tingkat akhir\n" +
                "Memiliki banyak relasi dan jaringan\n" +
                "\n" +
                "Keahlian :\n" +
                "- Memahami digital marketing\n" +
                "- Berpengalaman online atau offline marketing\n" +
                "- Menguasai traffic generation: SEO/SEM, Facebook Ads, Youtube dan Internet\n" +
                "- Kreatif dan target oriented",
        "https://www.instagram.com/p/CJTIFjxMQ4-/"
        ))
        partList.add(InternshipData(
                R.drawable.intern6,
                "Space&Shapes",
                "Copywriter/Content Writer",
                "Deadline 30 Januari 2021",
                "Responsibilities:\n" +
                        "• Conducting in-depth research on industry-related topics in order to develop original content\n" +
                        "• Developing content for blogs, articles, product descriptions, social media, and the company website\n" +
                        "• Assisting the marketing team in developing content for advertising campaigns\n" +
                        "• Proofreading content for errors and inconsistencies\n" +
                        "• Editing and polishing existing content to improve readability",
                "https://www.instagram.com/p/CJf4ydNs-f0/"
        ))
        partList.add(InternshipData(
                R.drawable.intern2,
                "Risala",
                "Social Media Officer, Graphic Designer, Event Planner",
                "Deadline akhir Januari 2021",
                "Syarat:\n" +
                        "1. Minimal semester 5 atau sudah masuk waktunya magang\n" +
                        "2. Kreatif, Enggak mudah puas dengan 1 ide, Senang mengulik\n" +
                        "3. Bisa membagi waktu dengan baik dan taat deadline\n" +
                        "4. Bisa kerja dari rumah",
                "https://www.instagram.com/p/CI67673H_nn/"
        ))
        return partList
    }
}